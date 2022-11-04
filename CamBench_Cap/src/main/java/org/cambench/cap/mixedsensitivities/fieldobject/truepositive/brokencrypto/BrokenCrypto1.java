package main.java.org.cambench.cap.mixedsensitivities.fieldobject.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass1 cryptoClass1 = new CryptoClass1();
        CryptoClass1 cryptoClass2 = new CryptoClass1();
        cryptoClass1.cipher1 = "Blowfish";
        cryptoClass1.cipher2 = "AES/CBC/PKCS5Padding";
        cryptoClass2.cipher1 = "AES/CBC/PKCS5Padding";
        cryptoClass2.cipher2 = "Blowfish";

        Cipher cipher = Cipher.getInstance(cryptoClass2.cipher2);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass2.cipher2);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static  class CryptoClass1{
        public String cipher1;
        public String cipher2;
    }
}