// Copyright 2012 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.enterprise.connector.filesystem;

/**
 */
public class SmbFileSystemTypeTest extends JavaFileSystemTypeTest {

  @Override
  protected FileSystemType getFileSystemType() {
    return new SmbFileSystemType(new DocumentContext(null, null, null, null,
        new TestFileSystemPropertyManager()));
  }

  @Override
  public void testIsPath() {
    assertTrue(fst.isPath("smb://a/b"));
    assertFalse(fst.isPath("/a/b"));
    assertFalse(fst.isPath("nfs://a/b"));
    assertFalse(fst.isPath("c:\\foo\\bar"));
    assertFalse(fst.isPath("\\\\unc\\foo\\bar"));
    assertFalse(fst.isPath(""));
    assertFalse(fst.isPath(null));
  }

  @Override
  public void testGetFileSystemType() {
    assertEquals("smb", fst.getName());
  }

  @Override
  public void testGetFile() throws Exception {
    // TODO: Can not really do this without a real SMB connection.
  }

  @Override
  public void testGetFileForDir() throws Exception {
    // TODO: Can not really do this without a real SMB connection.
  }

  @Override
  public void testUserPassowrdRequired() throws Exception {
    assertTrue(fst.isUserPasswordRequired());
  }
}