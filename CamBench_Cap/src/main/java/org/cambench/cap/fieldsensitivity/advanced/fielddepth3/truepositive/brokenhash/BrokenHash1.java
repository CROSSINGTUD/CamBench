package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth3.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashClass = new HashClass();
        hashClass.selfObject = new HashClass();
        hashClass.selfObject.selfObject = new HashClass();
        hashClass.selfObject.selfObject.hashAlgo1 = "MD5";
        hashClass.selfObject.selfObject.hashAlgo2 = "SHA-256";

        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance(hashClass.selfObject.selfObject.hashAlgo1);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static class HashClass{
        public HashClass selfObject;
        public String hashAlgo1;
        public String hashAlgo2;
    }
}