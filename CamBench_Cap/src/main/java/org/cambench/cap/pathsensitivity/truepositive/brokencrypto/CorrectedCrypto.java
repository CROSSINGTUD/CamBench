package main.java.org.cambench.cap.pathsensitivity.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CorrectedCrypto {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        KeyGenerator keyGen;

        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        keyGen = KeyGenerator.getInstance("AES");

        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}