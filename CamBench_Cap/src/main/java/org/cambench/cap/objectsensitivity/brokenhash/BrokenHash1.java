package main.java.org.cambench.cap.objectsensitivity.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass1 hashoOject1 = new HashClass1("MD2");
        HashClass1 hashoOject2 = new HashClass1("SHA-256");
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(hashoOject1.algorithm);
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
