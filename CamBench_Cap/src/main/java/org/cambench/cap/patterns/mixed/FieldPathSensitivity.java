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

package main.java.org.cambench.cap.patterns.mixed;

public class FieldPathSensitivity {
    public void main(String[] args) {
        Class1 classObject = new Class1();
        classObject.string1 = "secret value";
        classObject.string2 = "value";
        String output;

        int condition = 1;
        if(condition > 0) {
            output = "The value is: " + classObject.string2;
        } else {
            output = "The value is: " + classObject.string1;
        }

        System.out.println(output);
    }

    public static class Class1 {
        String string1;
        String string2;
    }
}
