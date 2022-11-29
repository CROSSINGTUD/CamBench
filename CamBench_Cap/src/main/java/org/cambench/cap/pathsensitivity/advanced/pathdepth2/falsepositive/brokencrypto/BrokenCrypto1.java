package main.java.org.cambench.cap.pathsensitivity.advanced.pathdepth2.falsepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        String algorithm;
        KeyGenerator keyGen;

        int condition = 1;
        if(condition > 0) {
            if(condition > 1) {
                algorithm = "DES";
            }
            else{
                algorithm = "AES/CBC/PKCS5Padding";
            }
        }
        else{
            algorithm = "Blowfish";
        }

        keyGen = KeyGenerator.getInstance("AES");
        cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}