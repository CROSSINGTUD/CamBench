package main.java.org.cambench.cap.mixedsensitivities.fieldpath.truenegative.brokenhash;

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