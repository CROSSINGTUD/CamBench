package main.java.org.cambench.cap.mixedsensitivities.objectpath.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass2 hashObject1;
        HashClass2 hashObject2;
        String data = "some data here";
        int condition = 1;

        if(condition < 1){
            hashObject1 = new HashClass2("SHA-256");
            hashObject2 = new HashClass2("SHA-1");
        } else {
            hashObject1 = new HashClass2("SHA-1");
            hashObject2 = new HashClass2("SHA-256");
        }

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