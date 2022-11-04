package main.java.org.cambench.cap.mixedsensitivities.fieldobject.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass2 cryptoClass1 = new CryptoClass2();
        CryptoClass2 cryptoClass2 = new CryptoClass2();
        cryptoClass1.cipher1 = "DES";
        cryptoClass1.cipher2 = "AES/CBC/PKCS5Padding";
        cryptoClass2.cipher1 = "AES/CBC/PKCS5Padding";
        cryptoClass2.cipher2 = "DES";

        Cipher cipher = Cipher.getInstance(cryptoClass2.cipher2);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass2.cipher2);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class CryptoClass2{
        public String cipher1;
        public String cipher2;
    }
}