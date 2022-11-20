package main.java.org.cambench.cap.contextsensitivity.advanced.callsites5.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String algo1 = Identity("MD2");
        String algo2 = Identity("SHA-256");
        String algo3 = Identity("MD5");
        String algo4 = Identity("SHA-256");
        String algo5 = Identity("SHA-1");

        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance(algo2);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static String Identity(String s){
        return s;
    }
}