package main.java.org.cambench.cap.pathsensitivity.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        String data = "some data here";
        int condition = 0;

        if(condition > 1) {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } else {
            messageDigest = MessageDigest.getInstance("MD5");
        }
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}