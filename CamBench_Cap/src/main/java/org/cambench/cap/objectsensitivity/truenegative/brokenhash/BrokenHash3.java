package main.java.org.cambench.cap.objectsensitivity.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash3 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass3 hashoOject1 = new HashClass3("MD5");
        HashClass3 hashoOject2 = new HashClass3("SHA-256");
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(hashoOject2.algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}

class HashClass3 {
    String algorithm;

    public HashClass3(String algo){
        algorithm = algo;
    }
}