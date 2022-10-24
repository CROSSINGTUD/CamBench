package main.java.org.cambench.cap.mixedsensitivities.inter2field.truepositive.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CorrectedHash {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HashClass1 hashClass = new HashClass1();
        hashClass.hashAlgo1 = "SHA-256";
        String data = "some data here";

        method1(hashClass.hashAlgo1, data);
    }

    public static void method1(String algo, String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algo);
        messageDigest.update(data.getBytes());
        System.out.println(messageDigest.digest());
    }
}
class HashClass{
    public String hashAlgo1;
    public String HashAlgo2;
}