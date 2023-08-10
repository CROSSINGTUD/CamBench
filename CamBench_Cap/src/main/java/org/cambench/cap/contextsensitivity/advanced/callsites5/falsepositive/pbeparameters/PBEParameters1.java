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

package org.cambench.cap.contextsensitivity.advanced.callsites5.falsepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        byte[] salt1 = Identity(new byte[]{123});
        byte[] salt2 = Identity(randomBytes);
        byte[] salt3 = Identity(new byte[]{123});
        byte[] salt4 = Identity(randomBytes);
        byte[] salt5 = Identity(new byte[]{123});

        int iterations = 10000000;

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt4,iterations);
    }

    public static byte[] Identity(byte[] i) {
        return i;
    }
}