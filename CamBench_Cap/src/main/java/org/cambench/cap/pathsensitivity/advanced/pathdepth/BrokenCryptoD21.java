package main.java.org.cambench.cap.pathsensitivity.advanced.pathdepth;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoD21 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        KeyGenerator keyGen;
        int condition = 1;
        if(condition > 0) {
            if(condition > 1) {
                cipher = Cipher.getInstance("DES");
                keyGen = KeyGenerator.getInstance("DES");
            }
            else{
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                keyGen = KeyGenerator.getInstance("AES");
            }
        }
        else{
            cipher = Cipher.getInstance("Blowfish");
            keyGen = KeyGenerator.getInstance("Blowfish");
        }
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}