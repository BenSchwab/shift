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

class StringArraySelectorPreference extends ShiftPref<StringArraySelector> {

    public StringArraySelectorPreference(ShiftPersistenceManager persistenceManager,
                                         String key,
                                         StringArraySelector defaultValue) {
        super(persistenceManager, key, defaultValue, StringArraySelector.class);
    }

    @Override
    StringArraySelector getValue() {
        return PERSISTENCE.getObject(KEY, StringArraySelector.class, DEFAULT_VALUE);
    }

    @Override
    void setValue(StringArraySelector value) {
        PERSISTENCE.putObject(KEY, value);
    }

    void setSelectedIndex(int index) {
        StringArraySelector newValue = PERSISTENCE.getObject(KEY, StringArraySelector.class, DEFAULT_VALUE);
        newValue.setSelectedIndex(index);
        PERSISTENCE.putObject(KEY, newValue);
    }
}
