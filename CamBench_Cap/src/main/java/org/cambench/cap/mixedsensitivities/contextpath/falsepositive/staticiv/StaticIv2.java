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

package org.cambench.cap.mixedsensitivities.contextpath.falsepositive.staticiv;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class StaticIv2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();
        byte[] ivBytes1;
        byte[] ivBytes2;

        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);
        int condition = 0;

        if(condition == 1){
            ivBytes1 = Identity(new byte[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'});
            ivBytes2 = Identity(randomBytes);
        } else {
            ivBytes1 = Identity(randomBytes);
            ivBytes2 = Identity(new byte[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'});
        }

        IvParameterSpec iv = new IvParameterSpec(ivBytes1);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static byte[] Identity(byte[] b) {return b;}
}