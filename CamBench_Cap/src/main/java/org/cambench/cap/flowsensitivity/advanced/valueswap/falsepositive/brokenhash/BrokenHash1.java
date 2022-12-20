package main.java.org.cambench.cap.flowsensitivity.advanced.valueswap.falsepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String data = "some data here";
        String algorithm1 = "MD5";
        String algorithm2 = "SHA-256";
        String swapper;

        swapper = algorithm2;
        algorithm2 = algorithm1;
        algorithm1 = swapper;
        algorithm2 = algorithm1;

        MessageDigest messageDigest = MessageDigest.getInstance(algorithm2);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}