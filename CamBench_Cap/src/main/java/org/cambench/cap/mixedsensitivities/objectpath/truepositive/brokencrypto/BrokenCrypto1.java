package main.java.org.cambench.cap.mixedsensitivities.objectpath.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        CryptoClass cryptoClass1 = new CryptoClass("AES/CBC/PKCS5Padding");
        CryptoClass cryptoClass2 = new CryptoClass("DES");

        int condition = 1;

        if(condition > 2){
            cipher = Cipher.getInstance(cryptoClass1.algorithm);
        } else {
            cipher = Cipher.getInstance(cryptoClass2.algorithm);
        }

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