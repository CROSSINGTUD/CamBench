package main.java.org.cambench.cap.basic.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance("MD2");
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}
