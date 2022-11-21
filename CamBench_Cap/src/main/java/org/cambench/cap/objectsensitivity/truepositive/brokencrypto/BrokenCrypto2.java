package main.java.org.cambench.cap.objectsensitivity.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass cryptoClass1 = new CryptoClass("AES/CBC/PKCS5Padding");
        CryptoClass cryptoClass2 = new CryptoClass("DES");

        Cipher cipher = Cipher.getInstance(cryptoClass2.algorithm);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass2.algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class CryptoClass {
        String algorithm;

        public CryptoClass(String algo) {
            algorithm = algo;
        }
    }
}