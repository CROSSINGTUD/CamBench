package main.java.org.cambench.cap.mixedsensitivities.inter2object.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass2 cryptoClass1 = new CryptoClass2("AES/CBC/PKCS5Padding");
        CryptoClass2 cryptoClass2 = new CryptoClass2("DES");

        method1(cryptoClass2.algorithm);
    }

    public static void method1(String algo) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algo);
        KeyGenerator keyGen = KeyGenerator.getInstance(algo);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}

class CryptoClass2 {
    String algorithm;

    public CryptoClass2(String algo) {
        algorithm = algo;
    }
}