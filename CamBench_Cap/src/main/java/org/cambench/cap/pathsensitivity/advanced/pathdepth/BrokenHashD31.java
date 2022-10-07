package main.java.org.cambench.cap.pathsensitivity.advanced.pathdepth;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashD31 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        String data = "some data here";
        int condition = 1;
        if(condition > 0) {
            if(condition > 0) {
                messageDigest = MessageDigest.getInstance("SHA-1");
            }
            else {
                if(condition > 0) {
                    messageDigest = MessageDigest.getInstance("SHA-256");
                }
                else {
                    messageDigest = MessageDigest.getInstance("MD4");
                }
            }
        }
        else {
            messageDigest = MessageDigest.getInstance("MD5");
        }
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}