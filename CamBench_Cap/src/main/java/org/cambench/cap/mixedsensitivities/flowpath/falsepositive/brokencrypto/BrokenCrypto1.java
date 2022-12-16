package main.java.org.cambench.cap.mixedsensitivities.flowpath.falsepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        KeyGenerator keyGen;
        String algorithm = "DES";
        int condition = 1;

        if(condition == 1){
            algorithm = "AES/CBC/PKCS5Padding";
        } else {
            algorithm = "Blowfish";
        }

        cipher = Cipher.getInstance(algorithm);
        keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}