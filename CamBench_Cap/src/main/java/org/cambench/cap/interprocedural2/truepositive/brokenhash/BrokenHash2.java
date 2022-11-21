package main.java.org.cambench.cap.interprocedural2.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String algo = "SHA-1";
        String data = "some data here";
        method1(algo, data);
    }

    public static void method1(String algo, String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algo);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}