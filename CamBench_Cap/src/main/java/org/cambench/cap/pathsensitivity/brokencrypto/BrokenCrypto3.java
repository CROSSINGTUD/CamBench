package main.java.org.cambench.cap.pathsensitivity.brokencrypto;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto3 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        KeyGenerator keyGen;
        int condition = 1;
        if(condition > 0) {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            keyGen = KeyGenerator.getInstance("AES");
        }
        else{
            cipher = Cipher.getInstance("RC2");
            keyGen = KeyGenerator.getInstance("RC2");
        }
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
