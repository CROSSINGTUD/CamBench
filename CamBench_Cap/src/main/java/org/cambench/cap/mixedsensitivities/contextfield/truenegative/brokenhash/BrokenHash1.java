package main.java.org.cambench.cap.mixedsensitivities.contextfield.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashClass = new HashClass();
        hashClass.hashAlgo1 = Identity("MD5");
        hashClass.hashAlgo2 = Identity("SHA-256");

        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance(hashClass.hashAlgo2);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static String Identity(String s){
        return s;
    }

    public static class HashClass{
        public String hashAlgo1;
        public String hashAlgo2;
    }
}