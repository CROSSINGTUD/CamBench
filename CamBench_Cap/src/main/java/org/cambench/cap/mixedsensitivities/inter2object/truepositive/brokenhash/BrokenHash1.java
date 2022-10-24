package main.java.org.cambench.cap.mixedsensitivities.inter2object.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass1 hashoOject1 = new HashClass1("MD5");
        HashClass1 hashoOject2 = new HashClass1("SHA-256");
        String data = "some data here";

        method1(hashoOject1.algorithm, data);
    }

    public static void method1(String algo, String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algo);
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