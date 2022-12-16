package main.java.org.cambench.cap.flowsensitivity.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String algorithm = "MD5";
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());

        algorithm = "SHA-256";
    }
}