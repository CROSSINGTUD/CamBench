package main.java.org.cambench.cap.mixedsensitivities.flowobject.truenegative.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass cryptoClass1 = new CryptoClass();
        CryptoClass cryptoClass2 = new CryptoClass();
        cryptoClass1.algorithm = "DES";
        cryptoClass2.algorithm = "DES";
        cryptoClass1.algorithm = "AES/CBC/PKCS5Padding";

        Cipher cipher = Cipher.getInstance(cryptoClass1.algorithm);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class CryptoClass {
        String algorithm;
    }
}