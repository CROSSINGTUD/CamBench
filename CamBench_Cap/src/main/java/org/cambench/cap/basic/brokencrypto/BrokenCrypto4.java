package main.java.org.cambench.cap.basic.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto4 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RC4");
        KeyGenerator keyGen = KeyGenerator.getInstance("RC4");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}