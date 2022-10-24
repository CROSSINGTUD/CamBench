package main.java.org.cambench.cap.interprocedural3.truenegative.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algo = "Blowfish";
        method1(algo);
    }

    public static void method1(String algo) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algorithm = algo;
        method2(algorithm);
    }

    public static void method2(String algorithm) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}