package main.java.org.cambench.cap.mixedsensitivities.contextpath.truenegative.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algo1 = Identity("Blowfish");
        String algo2 = Identity("AES/CBC/PKCS5Padding");
        Cipher cipher;

        int condition = 1;

        if(condition > 0 ){
            cipher = Cipher.getInstance(algo2);
        } else {
            cipher = Cipher.getInstance(algo1);
        }

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static String Identity(String s){
        return s;
    }
}