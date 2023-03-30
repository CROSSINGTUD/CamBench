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

package main.java.org.cambench.cap.pathsensitivity.advanced.pathdepth3.falsepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        String algorithm;
        KeyGenerator keyGen;
        int condition = 5;

        if(condition > 10) {
            algorithm = "DES";
        }
        else{
            if(condition > 0) {
                if(condition > 3) {
                    algorithm = "AES/CBC/PKCS5Padding";
                }
                else{
                    algorithm = "RC4";
                }
            }
            else{
                algorithm = "RC2";
            }
        }

        keyGen = KeyGenerator.getInstance("AES");
        cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}