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

package org.cambench.cap.mixedsensitivities.fieldobject.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashClass1 = new HashClass();
        HashClass hashClass2 = new HashClass();
        hashClass1.hashAlgo1 = "MD5";
        hashClass1.hashAlgo2 = "SHA-256";
        hashClass2.hashAlgo1 = "SHA-256";
        hashClass2.hashAlgo2 = "MD5";

        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance(hashClass2.hashAlgo2);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static class HashClass{
        public String hashAlgo1;
        public String hashAlgo2;
    }
}