package main.java.org.cambench.cap.objectsensitivity.advanced.multipleobjects.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass cryptoClass1 = new CryptoClass("RC2");
        CryptoClass cryptoClass2 = new CryptoClass("Blowfish");
        CryptoClass cryptoClass3 = new CryptoClass("RC4");
        CryptoClass cryptoClass4 = new CryptoClass("DES");
        CryptoClass cryptoClass5 = new CryptoClass("AES/CBC/PKCS5Padding");

        Cipher cipher = Cipher.getInstance(cryptoClass4.algorithm);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass4.algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class CryptoClass {
        String algorithm;

        public CryptoClass(String algo) {
            algorithm = algo;
        }
    }
}