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

package main.java.org.cambench.cap.mixedsensitivities.flowobject.falsepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashObject1 = new HashClass();
        HashClass hashObject2 = new HashClass();
        hashObject1.algorithm = "MD5";
        hashObject2.algorithm = "MD5";
        String data = "some data here";
        hashObject1.algorithm = "SHA-256";

        MessageDigest messageDigest = MessageDigest.getInstance(hashObject1.algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static class HashClass {
        String algorithm;
    }
}