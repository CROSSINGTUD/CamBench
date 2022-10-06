package main.java.org.cambench.cap.objectsensitivity.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass2 hashObject1 = new HashClass2("MD4");
        HashClass2 hashObject2 = new HashClass2("SHA-256");
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(hashObject2.algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}

class HashClass2 {
    String algorithm;

    public HashClass2(String algo){
        algorithm = algo;
    }
}