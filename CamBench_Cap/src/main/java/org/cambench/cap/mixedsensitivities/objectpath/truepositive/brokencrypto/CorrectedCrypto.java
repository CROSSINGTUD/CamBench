package main.java.org.cambench.cap.mixedsensitivities.objectpath.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CorrectedCrypto {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        CryptoClass cryptoClass1 = new CryptoClass("AES/CBC/PKCS5Padding");

        cipher = Cipher.getInstance(cryptoClass1.algorithm);

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class CryptoClass {
        String algorithm;

        public CryptoClass(String algo) {
            algorithm = algo;
        }
    }
}