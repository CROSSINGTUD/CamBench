package main.java.org.cambench.cap.objectsensitivity.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass1 hashObject1 = new HashClass1("MD2");
        HashClass1 hashObject2 = new HashClass1("SHA-256");
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(hashObject2.algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}

class HashClass1 {
    String algorithm;

    public HashClass1(String algo){
        algorithm = algo;
    }
}