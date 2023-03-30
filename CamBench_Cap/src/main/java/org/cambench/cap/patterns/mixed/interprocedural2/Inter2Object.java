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

package main.java.org.cambench.cap.patterns.mixed.interprocedural2;

import main.java.org.cambench.cap.patterns.pure.ObjectSensitivity;

public class Inter2Object {
    public void main(String[] args) {
        DataObject dataObject1 = new DataObject();
        DataObject dataObject2 = new DataObject();
        dataObject1.value = "secret value";
        dataObject2.value = "non secret value";

        method(dataObject2.value);
    }

    public static void method(String str){
        System.out.println(str);
    }

    private class DataObject{
        public String value;
    }
}