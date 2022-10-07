package main.java.org.cambench.cap.mixedsensitivities.contextpath.truenegative.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algo1;
        String algo2;
        int condition = 1;

        if(condition > 0){
            algo1 = Identity("DES");
            algo2 = Identity("AES/CBC/PKCS5Padding");
        } else {
            algo1 = Identity("AES/CBC/PKCS5Padding");
            algo2 = Identity("DES");
        }

        Cipher cipher = Cipher.getInstance(algo2);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static String Identity(String s){
        return s;
    }
}