package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth2.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CorrectedHash {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashClass = new HashClass();
        hashClass.selfObject = new HashClass();
        hashClass.selfObject.hashAlgo2 = "SHA-256";

        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance(hashClass.selfObject.hashAlgo2);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static class HashClass{
        public HashClass selfObject;
        public String hashAlgo1;
        public String hashAlgo2;
    }
}