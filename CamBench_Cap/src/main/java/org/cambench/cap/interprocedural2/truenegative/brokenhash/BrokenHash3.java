package main.java.org.cambench.cap.interprocedural2.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash3 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String algo = "MD5";
        String data = "some data here";
        method1(algo, data);
    }

    public static void method1(String algo, String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}