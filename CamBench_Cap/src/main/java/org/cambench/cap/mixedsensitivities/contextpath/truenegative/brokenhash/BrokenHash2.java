package main.java.org.cambench.cap.mixedsensitivities.contextpath.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String algo1;
        String algo2;
        String data = "some data here";
        int condition = 1;

        if(condition < 3){
            algo1 = Identity("SHA-1");
            algo2 = Identity("SHA-256");
        } else {
            algo1 = Identity("SHA-256");
            algo2 = Identity("SHA-1");
        }

        MessageDigest messageDigest = MessageDigest.getInstance(algo2);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static String Identity(String s){
        return s;
    }
}