package main.java.org.cambench.cap.mixedsensitivities.contextfield.falsepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass cryptoClass = new CryptoClass();
        cryptoClass.cipher1 = Identity("Blowfish");
        cryptoClass.cipher2 = Identity("AES/CBC/PKCS5Padding");

        Cipher cipher = Cipher.getInstance(cryptoClass.cipher2);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static String Identity(String s){
        return s;
    }

    public static  class CryptoClass{
        public String cipher1;
        public String cipher2;
    }
}