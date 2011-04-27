// Copyright 2010 Google Inc.
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
 * Should be thrown in cases where the crawler user does not have enough
 * privileges to perform the required operation.
 */
public class InsufficientAccessException extends Exception {
    /**
     * Constructs a new InsufficientAccessException with message.
     *
     * @param message the message.
     */
    public InsufficientAccessException(String message) {
      super(message);
    }

    /**
     * Constructs a new InsufficientAccessException with message and cause.
     *
     * @param message the message
     *
     * @param cause root failure cause
     */
    public InsufficientAccessException(String message, Throwable cause) {
      super(message, cause);
    }
}
