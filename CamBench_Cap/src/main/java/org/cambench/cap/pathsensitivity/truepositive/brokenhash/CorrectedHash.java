package main.java.org.cambench.cap.pathsensitivity.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CorrectedHash {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        String data = "some data here";

        messageDigest = MessageDigest.getInstance("SHA-256");

        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}