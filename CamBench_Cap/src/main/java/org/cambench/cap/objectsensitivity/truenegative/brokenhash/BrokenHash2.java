package main.java.org.cambench.cap.objectsensitivity.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashObject1 = new HashClass("SHA-1");
        HashClass hashObject2 = new HashClass("SHA-256");
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(hashObject2.algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static class HashClass {
        String algorithm;

        public HashClass(String algo){
            algorithm = algo;
        }
    }
}