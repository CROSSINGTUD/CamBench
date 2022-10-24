package main.java.org.cambench.cap.interprocedural3.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String algo = "MD2";
        String data = "some data here";
        method1(algo, data);
    }

    public static void method1(String algo, String data) throws NoSuchAlgorithmException {
        String algorithm = algo;
        String dataString = data;
        method2(algorithm, dataString);
    }

    public static void method2(String algorithm, String dataString) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(dataString.getBytes());
        System.out.println(messageDigest.digest());
    }
}