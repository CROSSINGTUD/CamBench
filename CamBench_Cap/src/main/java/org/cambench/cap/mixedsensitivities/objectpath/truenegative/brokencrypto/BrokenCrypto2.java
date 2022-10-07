package main.java.org.cambench.cap.mixedsensitivities.objectpath.truenegative.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass2 cryptoClass1;
        CryptoClass2 cryptoClass2;

        int condition = 1;

        if(condition < 1){
            cryptoClass1 = new CryptoClass2("DES");
            cryptoClass2 = new CryptoClass2("AES/CBC/PKCS5Padding");
        } else {
            cryptoClass1 = new CryptoClass2("AES/CBC/PKCS5Padding");
            cryptoClass2 = new CryptoClass2("DES");
        }

        Cipher cipher = Cipher.getInstance(cryptoClass1.algorithm);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}

class CryptoClass2 {
    String algorithm;

    public CryptoClass2(String algo) {
        algorithm = algo;
    }
}