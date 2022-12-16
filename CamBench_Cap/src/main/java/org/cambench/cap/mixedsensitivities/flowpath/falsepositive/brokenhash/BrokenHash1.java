package main.java.org.cambench.cap.mixedsensitivities.flowpath.falsepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        String data = "some data here";
        String algorithm = "MD5";
        int condition = 1;

        if(condition > 1) {
            algorithm = "SHA-1";
        } else {
            algorithm = "SHA-256";
        }

        messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}