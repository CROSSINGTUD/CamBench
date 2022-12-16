package main.java.org.cambench.cap.mixedsensitivities.contextobject.falsepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashObject1 = GetObject("MD5");
        HashClass hashObject2 = GetObject("SHA-256");
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(hashObject2.algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static HashClass GetObject(String algo){
        HashClass object = new HashClass();
        object.algorithm = algo;
        return object;
    }

    public static class HashClass {
        String algorithm;
    }
}