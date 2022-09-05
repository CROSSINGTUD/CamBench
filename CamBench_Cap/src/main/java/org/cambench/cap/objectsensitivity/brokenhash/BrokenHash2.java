package main.java.org.cambench.cap.objectsensitivity.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass2 hashoOject1 = new HashClass2("MD4");
        HashClass2 hashoOject2 = new HashClass2("SHA-256");
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(hashoOject1.algorithm);
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
