package main.java.org.cambench.cap.mixedsensitivities.fieldflow.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass1 hashClass = new HashClass1();
        hashClass.hashAlgo1 = "MD5";
        hashClass.hashAlgo2 = "SHA-1";
        hashClass.hashAlgo2 = "SHA-256";

        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance(hashClass.hashAlgo1);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static class HashClass1{
        public String hashAlgo1;
        public String hashAlgo2;
    }
}