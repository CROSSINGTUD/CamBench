package main.java.org.cambench.cap.mixedsensitivities.objectpath.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashObject1;
        HashClass hashObject2;
        String data = "some data here";
        int condition = 1;

        if(condition > 0){
            hashObject1 = new HashClass("SHA-256");
            hashObject2 = new HashClass("SHA-1");
        } else {
            hashObject1 = new HashClass("SHA-1");
            hashObject2 = new HashClass("SHA-256");
        }

        MessageDigest messageDigest = MessageDigest.getInstance(hashObject2.algorithm);
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