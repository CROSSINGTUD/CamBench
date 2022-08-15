package main.java.org.cambench.cap.pathsensitivity.brokencrypto;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher;
        KeyGenerator keyGen;
        int condition = 1;
        if(condition > 0) {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            keyGen = KeyGenerator.getInstance("AES");
        }
        else{
            cipher = Cipher.getInstance("DES");
            keyGen = KeyGenerator.getInstance("DES");
        }
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
