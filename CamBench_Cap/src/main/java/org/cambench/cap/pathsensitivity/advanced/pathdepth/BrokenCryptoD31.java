package main.java.org.cambench.cap.pathsensitivity.advanced.pathdepth;

import javax.crypto.*;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoD31 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher;
        KeyGenerator keyGen;
        int condition = 5;
        if(condition > 10) {
            cipher = Cipher.getInstance("DES");
            keyGen = KeyGenerator.getInstance("DES");
        }
        else{
            if(condition > 0) {
                if(condition > 3) {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    keyGen = KeyGenerator.getInstance("AES");
                }
                else{
                    cipher = Cipher.getInstance("RC4");
                    keyGen = KeyGenerator.getInstance("RC4");
                }
            }
            else{
                cipher = Cipher.getInstance("RC2");
                keyGen = KeyGenerator.getInstance("RC2");
            }
        }
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}