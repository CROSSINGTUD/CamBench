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

package main.java.org.cambench.cap.patterns.pure;

public class Interprocedural3 {
    public static void main(String[] args) {
        String value = "secret value";
        method1(value);
    }

    public static void method1(String str1){
        String value2 = str1;
        method2(value2);
    }

    public static void method2(String str2){
        System.out.println(str2);
    }
}
