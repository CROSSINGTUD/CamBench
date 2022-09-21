package main.java.org.cambench.cap.objectsensitivity.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto3 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass3 cryptoClass1 = new CryptoClass3("AES/CBC/PKCS5Padding");
        CryptoClass3 cryptoClass2 = new CryptoClass3("RC2");

        Cipher cipher = Cipher.getInstance(cryptoClass2.algorithm);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass2.algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}

class CryptoClass3 {
    String algorithm;

    public CryptoClass3(String algo) {
        algorithm = algo;
    }
}