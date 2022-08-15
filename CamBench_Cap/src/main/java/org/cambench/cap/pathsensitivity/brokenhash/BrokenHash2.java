package main.java.org.cambench.cap.pathsensitivity.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        String data = "some data here";
        Integer condition = 1;
        if(condition > 0) {
            messageDigest = MessageDigest.getInstance("SHA-256");
        }
        else {
            messageDigest = MessageDigest.getInstance("MD4");
        }
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}
