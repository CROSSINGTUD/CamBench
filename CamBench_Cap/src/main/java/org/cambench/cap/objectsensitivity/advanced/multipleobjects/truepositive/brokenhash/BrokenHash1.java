package main.java.org.cambench.cap.objectsensitivity.advanced.multipleobjects.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashObject1 = new HashClass("MD2");
        HashClass hashObject2 = new HashClass("SHA-256");
        HashClass hashObject3 = new HashClass("MD5");
        HashClass hashObject4 = new HashClass("SHA-1");
        HashClass hashObject5 = new HashClass("MD4");
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(hashObject3.algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static class HashClass {
        String algorithm;

        public HashClass(String algo){
            algorithm = algo;
        }
    }
}