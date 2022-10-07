package main.java.org.cambench.cap.mixedsensitivities.flowpath.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        int condition = 1;

        if(condition > 3) {
            messageDigest = MessageDigest.getInstance("SHA-1");
        } else {
            messageDigest = MessageDigest.getInstance("SHA-256");
        }

        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}