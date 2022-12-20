package main.java.org.cambench.cap.contextsensitivity.advanced.callsites5.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algo1 = Identity("Blowfish");
        String algo2 = Identity("AES/CBC/PKCS5Padding");
        String algo3 = Identity("DES");
        String algo4 = Identity("AES/CBC/PKCS5Padding");
        String algo5 = Identity("RC2");


        Cipher cipher = Cipher.getInstance(algo3);
        KeyGenerator keyGen = KeyGenerator.getInstance(algo3);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static String Identity(String s){
        return s;
    }
}