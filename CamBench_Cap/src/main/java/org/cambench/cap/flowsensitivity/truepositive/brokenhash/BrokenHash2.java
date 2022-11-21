package main.java.org.cambench.cap.flowsensitivity.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String algorithm = "SHA-1";
        String data = "some data here";

        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());

        algorithm = "SHA-256";
    }
}