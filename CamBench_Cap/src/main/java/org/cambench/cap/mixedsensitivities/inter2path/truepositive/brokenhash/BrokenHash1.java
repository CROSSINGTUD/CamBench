package main.java.org.cambench.cap.mixedsensitivities.inter2path.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        int condition = 0;

        if(condition > 1) {
            method1("SHA-256", "some data here");
        } else {
           method1("MD5","some data here");
        }
    }

    public static void method1(String algo, String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algo);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}