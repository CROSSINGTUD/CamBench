package main.java.org.cambench.cap.objectsensitivity.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash4 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass4 hashoOject1 = new HashClass4("SHA-1");
        HashClass4 hashoOject2 = new HashClass4("SHA-256");
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(hashoOject1.algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}

class HashClass4 {
    String algorithm;

    public HashClass4(String algo){
        algorithm = algo;
    }
}
