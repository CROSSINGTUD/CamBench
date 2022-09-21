package main.java.org.cambench.cap.objectsensitivity.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto4 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass4 cryptoClass1 = new CryptoClass4("AES/CBC/PKCS5Padding");
        CryptoClass4 cryptoClass2 = new CryptoClass4("RC4");

        Cipher cipher = Cipher.getInstance(cryptoClass2.algorithm);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass2.algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}

class CryptoClass4 {
    String algorithm;

    public CryptoClass4(String algo) {
        algorithm = algo;
    }
}