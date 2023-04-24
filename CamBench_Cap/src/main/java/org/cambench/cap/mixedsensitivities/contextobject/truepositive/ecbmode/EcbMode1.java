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

package org.cambench.cap.mixedsensitivities.contextobject.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass algoConfig1 = GetObject("AES/ECB/PKCS5Padding");
        ConfigClass algoConfig2 = GetObject("AES/CBC/PKCS5Padding");

        Cipher cipher = Cipher.getInstance(algoConfig1.algorithmConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static ConfigClass GetObject(String config){
        ConfigClass object = new ConfigClass();
        object.algorithmConfig = config;
        return object;
    }

    public static class ConfigClass {
        String algorithmConfig;
    }
}