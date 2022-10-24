package main.java.org.cambench.cap.mixedsensitivities.inter2object.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass2 hashoOject1 = new HashClass2("SHA-1");
        HashClass2 hashoOject2 = new HashClass2("SHA-256");
        String data = "some data here";

        method1(hashoOject1.algorithm, data);
    }

    public static void method1(String algo, String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algo);
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