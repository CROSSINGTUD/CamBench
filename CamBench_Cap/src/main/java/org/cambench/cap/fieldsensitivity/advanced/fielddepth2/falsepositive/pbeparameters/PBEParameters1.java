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

package org.cambench.cap.fieldsensitivity.advanced.fielddepth2.falsepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomSalt = new byte[16];
        secureRandom.nextBytes(randomSalt);

        ParameterClass paramClass = new ParameterClass();
        paramClass.selfObject = new ParameterClass();
        paramClass.selfObject.salt1 = new byte[]{123};
        paramClass.selfObject.salt2 = randomSalt;

        int iterations = 10000000;
        PBEParameterSpec pbeParameterSpecSpec = new PBEParameterSpec(paramClass.selfObject.salt2,iterations);
    }

    public static class ParameterClass{
        public ParameterClass selfObject;
        public byte[] salt1;
        public byte[] salt2;
    }
}