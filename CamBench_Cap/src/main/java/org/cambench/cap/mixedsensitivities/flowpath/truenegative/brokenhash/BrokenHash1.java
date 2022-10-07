package main.java.org.cambench.cap.mixedsensitivities.flowpath.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        int condition = 1;

        if(condition > 1) {
            messageDigest = MessageDigest.getInstance("MD5");
        } else {
            messageDigest = MessageDigest.getInstance("SHA-256");
        }

        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}