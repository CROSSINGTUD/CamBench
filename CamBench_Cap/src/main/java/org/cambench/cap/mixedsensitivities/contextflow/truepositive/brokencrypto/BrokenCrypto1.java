package main.java.org.cambench.cap.mixedsensitivities.contextflow.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algo1 = Identity("DES");
        String algo2 = Identity("AES/CBC/PKCS5Padding");

        Cipher cipher = Cipher.getInstance(algo1);
        KeyGenerator keyGen = KeyGenerator.getInstance(algo1);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());

        algo1 = Identity("AES/CBC/PKCS5Padding");
    }

    public static String Identity(String s){
        return s;
    }
}