package main.java.org.cambench.cap.mixedsensitivities.inter2context.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String algo1 = Identity("SHA-1");
        String algo2 = Identity("SHA-256");

        method1(algo1,"some data here");
    }

    public static String Identity(String s){
        return s;
    }

    public static void method1(String algo, String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algo);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}