package main.java.org.cambench.cap.mixedsensitivities.inter2path.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        int condition = 0;

        if(condition > 1) {
            method1("AES","AES/CBC/PKCS5Padding");
        } else {
            method1("Blowfish","Blowfish");
        }
    }

    public static void method1(String algoName, String algoConfig) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algoConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance(algoName);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}