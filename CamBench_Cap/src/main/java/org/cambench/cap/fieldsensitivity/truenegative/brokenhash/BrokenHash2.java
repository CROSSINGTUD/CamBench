package main.java.org.cambench.cap.fieldsensitivity.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashClass = new HashClass();
        hashClass.hashAlgo1 = "SHA-1";
        hashClass.hashAlgo2 = "SHA-256";

        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance(hashClass.hashAlgo2);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static class HashClass{
        public String hashAlgo1;
        public String hashAlgo2;
    }
}