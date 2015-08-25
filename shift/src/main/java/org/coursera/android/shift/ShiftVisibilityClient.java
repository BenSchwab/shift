/*
 Copyright 2015 Coursera Inc.
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
     http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.coursera.android.shift;

/**
 * Decides whether or not the Shift view and menu should be visible.
 * Must be implemented by the client and provided to {@link ShiftManager} on initialization.
 */
public interface ShiftVisibilityClient {
    boolean isVisible();
    void setIsVisible(boolean isVisible);
}
