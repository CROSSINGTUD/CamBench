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

public class ContextPathSensitivity {
    public static void main(String[] args){
        String value1 = Identity("value");
        String value2 = Identity("secret value");
        String output;

        int condition = 1;
        if(condition > 1) {
            output = "The value is: " + value2;
        } else {
            output = "The value is: " + value1;
        }

        System.out.println(output);
    }

    public static String Identity(String s){
        return s;
    }
}
