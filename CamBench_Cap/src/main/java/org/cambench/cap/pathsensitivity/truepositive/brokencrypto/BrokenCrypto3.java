package main.java.org.cambench.cap.pathsensitivity.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto3 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        KeyGenerator keyGen;
        int condition = 0;

        if(condition > 1) {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            keyGen = KeyGenerator.getInstance("AES");
        } else {
            cipher = Cipher.getInstance("RC2");
            keyGen = KeyGenerator.getInstance("RC2");
        }
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}