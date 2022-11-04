package main.java.org.cambench.cap.mixedsensitivities.fieldflow.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass1 cryptoClass = new CryptoClass1();
        cryptoClass.cipher1 = "Blowfish";
        cryptoClass.cipher2 = "AES/CBC/PKCS5Padding";

        Cipher cipher = Cipher.getInstance(cryptoClass.cipher1);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass.cipher1);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());

        cryptoClass.cipher1 = "AES/CBC/PKCS5Padding";
    }

    public static class CryptoClass1{
        public String cipher1;
        public String cipher2;
    }
}