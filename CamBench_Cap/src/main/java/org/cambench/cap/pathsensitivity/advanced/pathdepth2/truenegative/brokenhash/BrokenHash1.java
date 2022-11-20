package main.java.org.cambench.cap.pathsensitivity.advanced.pathdepth2.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        String algorithm;
        String data = "some data here";

        int condition = 1;
        if(condition > 1) {
            algorithm = "MD5";
        }
        else {
            if(condition > 0) {
                algorithm = "SHA-256";
            }
            else {
                algorithm = "SHA-1";
            }
        }

        messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}