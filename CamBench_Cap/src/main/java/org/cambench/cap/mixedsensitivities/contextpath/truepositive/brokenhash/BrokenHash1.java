package main.java.org.cambench.cap.mixedsensitivities.contextpath.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        String algo1 = Identity("MD5");
        String algo2 = Identity("SHA-256");
        String data = "some data here";
        int condition = 1;

        if(condition == 1){
            messageDigest = MessageDigest.getInstance(algo1);
        } else {
            messageDigest = MessageDigest.getInstance(algo2);
        }

        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static String Identity(String s){
        return s;
    }
}