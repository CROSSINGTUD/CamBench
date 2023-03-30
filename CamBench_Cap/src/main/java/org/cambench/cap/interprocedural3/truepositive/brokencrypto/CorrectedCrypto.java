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

package main.java.org.cambench.cap.interprocedural3.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CorrectedCrypto {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algo = "AES";
        method1(algo);
    }

    public static void method1(String algo) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algorithm = algo;
        method2(algorithm);
    }

    public static void method2(String algorithm) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algoConfig = String.join("/", algorithm,"CBC","PKCS5Padding");
        Cipher cipher = Cipher.getInstance(algoConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
