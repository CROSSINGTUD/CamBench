package main.java.org.cambench.cap.pathsensitivity.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoPSC1Case5 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        KeyGenerator keyGen;
        int condition = 1;
        if(condition > 0) {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            keyGen = KeyGenerator.getInstance("AES");
        }
        else{
            cipher = Cipher.getInstance("RC5");
            keyGen = KeyGenerator.getInstance("RC5");
        }
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
