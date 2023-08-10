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

package org.cambench.cap.mixedsensitivities.fieldobject.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass1 configClass1 = new ConfigClass1();
        ConfigClass1 configClass2 = new ConfigClass1();
        configClass1.algoConfig1 = "AES/ECB/PKCS5Padding";
        configClass1.algoConfig2 = "AES/GCM/NoPadding";
        configClass2.algoConfig1 = "AES/GCM/NoPadding";
        configClass2.algoConfig2 = "AES/ECB/PKCS5Padding";

        Cipher cipher = Cipher.getInstance(configClass2.algoConfig2);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class ConfigClass1{
        public String algoConfig1;
        public String algoConfig2;
    }
}