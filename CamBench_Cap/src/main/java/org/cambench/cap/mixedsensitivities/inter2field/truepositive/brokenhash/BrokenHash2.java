package main.java.org.cambench.cap.mixedsensitivities.inter2field.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHash2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass2 hashClass = new HashClass2();
        hashClass.hashAlgo1 = "SHA-1";
        hashClass.hashAlgo2 = "SHA-256";
        String data = "some data here";

        method1(hashClass.hashAlgo1, data);
    }

    public static void method1 (String algo, String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algo);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}
class HashClass2{
    public String hashAlgo1;
    public String hashAlgo2;
}