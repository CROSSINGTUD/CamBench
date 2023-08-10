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

package org.cambench.cap.mixedsensitivities.fieldpath.falsepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashClass = new HashClass();

        String data = "some data here";
        int condition = 1;
        MessageDigest messageDigest;

        if(condition < 1){
            hashClass.hashAlgo1 = "SHA-1";
            hashClass.hashAlgo2 = "SHA-256";
        } else {
            hashClass.hashAlgo1 = "SHA-256";
            hashClass.hashAlgo2 = "SHA-1";
        }

        messageDigest = MessageDigest.getInstance(hashClass.hashAlgo1);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static class HashClass {
        public String hashAlgo1;
        public String hashAlgo2;
    }
}