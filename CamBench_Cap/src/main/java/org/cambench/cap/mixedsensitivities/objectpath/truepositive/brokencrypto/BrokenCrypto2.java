package main.java.org.cambench.cap.mixedsensitivities.objectpath.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass cryptoClass1;
        CryptoClass cryptoClass2;

        int condition = 1;

        if(condition < 2){
            cryptoClass1 = new CryptoClass("Blowfish");
            cryptoClass2 = new CryptoClass("AES/CBC/PKCS5Padding");
        } else {
            cryptoClass1 = new CryptoClass("AES/CBC/PKCS5Padding");
            cryptoClass2 = new CryptoClass("Blowfish");
        }

        Cipher cipher = Cipher.getInstance(cryptoClass1.algorithm);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass1.algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class CryptoClass {
        String algorithm;

        public CryptoClass(String algo) {
            algorithm = algo;
        }
    }
}