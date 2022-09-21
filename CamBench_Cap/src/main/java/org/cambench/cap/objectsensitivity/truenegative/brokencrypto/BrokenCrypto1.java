package main.java.org.cambench.cap.objectsensitivity.truenegative.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass1 cryptoClass1 = new CryptoClass1("AES/CBC/PKCS5Padding");
        CryptoClass1 cryptoClass2 = new CryptoClass1("Blowfish");

        Cipher cipher = Cipher.getInstance(cryptoClass1.algorithm);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}

class CryptoClass1 {
    String algorithm;

    public CryptoClass1(String algo) {
        algorithm = algo;
    }
}