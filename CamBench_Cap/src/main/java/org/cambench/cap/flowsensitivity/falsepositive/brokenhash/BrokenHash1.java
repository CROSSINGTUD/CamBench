package main.java.org.cambench.cap.flowsensitivity.falsepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String algorithm = "MD5";
        String data = "some data here";
        algorithm = "SHA-256";

        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}