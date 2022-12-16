package main.java.org.cambench.cap.objectsensitivity.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashObject1 = new HashClass("MD5");
        HashClass hashObject2 = new HashClass("SHA-256");
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(hashObject1.algorithm);
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