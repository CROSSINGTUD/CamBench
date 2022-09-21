package main.java.org.cambench.cap.fieldsensitivity.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash3 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass3 hashClass = new HashClass3();
        hashClass.hashAlgo1 = "MD5";
        hashClass.hashAlgo2 = "SHA-256";

        String data = "some data here";
        MessageDigest messageDigest = MessageDigest.getInstance(hashClass.hashAlgo1);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}
class HashClass3{
    public String hashAlgo1;
    public String hashAlgo2;
}