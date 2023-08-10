/*
 * Copyright 2022-2023 The CamBench Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cambench.cap.patterns.mixed;

public class FieldObjectSensitivity {
    public static void main(String[] args) {
        DataObject dataObject1 = new DataObject();
        DataObject dataObject2 = new DataObject();
        dataObject1.value1 = "secret value";
        dataObject2.value1 = "non secret value";
        dataObject1.value2 = "non secret value";
        dataObject2.value2 = "secret value";

        System.out.println(dataObject2.value2);
    }

    public static class DataObject{
        String value1;
        String value2;
    }
}