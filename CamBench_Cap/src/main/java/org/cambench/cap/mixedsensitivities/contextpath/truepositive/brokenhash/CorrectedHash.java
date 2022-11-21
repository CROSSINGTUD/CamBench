package main.java.org.cambench.cap.mixedsensitivities.contextpath.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CorrectedHash {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        String algo2 = Identity("SHA-256");
        String data = "some data here";

        messageDigest = MessageDigest.getInstance(algo2);

        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }

    public static String Identity(String s){
        return s;
    }
}