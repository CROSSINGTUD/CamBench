package main.java.org.cambench.cap.mixedsensitivities.inter2object.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass1 cryptoClass1 = new CryptoClass1("AES/CBC/PKCS5Padding");
        CryptoClass1 cryptoClass2 = new CryptoClass1("Blowfish");

        method1(cryptoClass2.algorithm);
    }

    public static void method1(String algo) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algo);
        KeyGenerator keyGen = KeyGenerator.getInstance(algo);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}

class CryptoClass1 {
    String algorithm;

    public CryptoClass1(String algo) {
        algorithm = algo;
    }
}