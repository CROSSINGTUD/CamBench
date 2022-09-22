package main.java.org.cambench.cap.pathsensitivity.truenegative.brokencrypto;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto4 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        KeyGenerator keyGen;
        int condition = 1;
        if(condition > 0) {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            keyGen = KeyGenerator.getInstance("AES");
        }
        else{
            cipher = Cipher.getInstance("RC4");
            keyGen = KeyGenerator.getInstance("RC4");
        }
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}