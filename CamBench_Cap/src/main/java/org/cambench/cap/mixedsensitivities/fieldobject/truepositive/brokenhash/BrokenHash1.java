package main.java.org.cambench.cap.mixedsensitivities.fieldobject.truepositive.brokenhash;

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