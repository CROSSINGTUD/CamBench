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

package org.cambench.cap.flowsensitivity.advanced.valueswap.falsepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] array1 = new byte[16];
        secureRandom.nextBytes(array1);
        byte[] array2 = new byte[]{123};
        byte[] swapper;

        swapper = array1;
        array1 = array2;
        array2 = swapper;
        array1 = array2;

        int iterations = 10000000;
        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(array1, iterations);
    }
}