package main.java.org.cambench.cap.mixedsensitivities.inter2object.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CorrectedHash {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass hashoOject = new HashClass("SHA-256");
        String data = "some data here";

        method1(hashoOject.algorithm, data);
    }

    public static void method1(String algo, String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algo);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}

class HashClass {
    String algorithm;

    public HashClass(String algo){
        algorithm = algo;
    }
}