package main.java.org.cambench.cap.mixedsensitivities.fieldpath.truenegative.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass1 hashClass = new HashClass1();
        hashClass.hashAlgo1 = "MD5";
        hashClass.hashAlgo2 = "SHA-256";

        String data = "some data here";
        int condition = 1;
        MessageDigest messageDigest;

        if(condition >0){
            messageDigest = MessageDigest.getInstance(hashClass.hashAlgo2);
        } else {
            messageDigest = MessageDigest.getInstance(hashClass.hashAlgo1);
        }

        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}
class HashClass1{
    public String hashAlgo1;
    public String hashAlgo2;
}