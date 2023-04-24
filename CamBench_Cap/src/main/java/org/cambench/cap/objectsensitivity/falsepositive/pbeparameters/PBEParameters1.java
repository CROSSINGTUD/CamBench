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

package main.java.org.cambench.cap.objectsensitivity.falsepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes =new byte[16];
        secureRandom.nextBytes(randomBytes);


        SaltClass saltClass1 = new SaltClass(new byte[]{123});
        SaltClass saltClass2 = new SaltClass(randomBytes);
        int iterations = 20000;

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(saltClass2.salt,iterations);
    }

    public static class SaltClass {
        public byte[] salt;
        public SaltClass(byte[] s){ salt = s; }
    }
}