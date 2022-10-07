package main.java.org.cambench.cap.mixedsensitivities.objectpath.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        HashClass1 hashObject1 = new HashClass1("MD5");
        HashClass1 hashObject2 = new HashClass1("SHA-256");

        String data = "some data here";
        int condition = 1;

        if(condition > 0){
            messageDigest = MessageDigest.getInstance(hashObject2.algorithm);
        } else {
            messageDigest = MessageDigest.getInstance(hashObject1.algorithm);
        }

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