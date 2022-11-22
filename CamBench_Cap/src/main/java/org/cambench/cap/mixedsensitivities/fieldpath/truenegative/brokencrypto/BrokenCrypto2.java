package main.java.org.cambench.cap.mixedsensitivities.fieldpath.truenegative.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass cryptoClass = new CryptoClass();
        Cipher cipher;
        int condition = 1;

        if (condition > 0) {
            cryptoClass.cipher1 = "Blowfish";
            cryptoClass.cipher2 = "AES/CBC/PKCS5Padding";
        } else {
            cryptoClass.cipher1 = "AES/CBC/PKCS5Padding";
            cryptoClass.cipher2 = "Blowfish";
        }

        cipher = Cipher.getInstance(cryptoClass.cipher2);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class CryptoClass{
        public String cipher1;
        public String cipher2;
    }
}