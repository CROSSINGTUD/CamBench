package main.java.org.cambench.cap.objectsensitivity.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto5 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass5 cryptoClass1 = new CryptoClass5("AES/CBC/PKCS5Padding");
        CryptoClass5 cryptoClass2 = new CryptoClass5("RC5");

        Cipher cipher = Cipher.getInstance(cryptoClass2.algorithm);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass2.algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}

class CryptoClass5 {
    String algorithm;

    public CryptoClass5(String algo) {
        algorithm = algo;
    }
}