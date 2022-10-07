package main.java.org.cambench.cap.mixedsensitivities.contextpath.truenegative.insecurerandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class InsecureRandom1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        Random random1;
        Random random2;

        int condition = 1;

        if(condition == 1){
            random1 = Identity(new Random());
            random2 = Identity(new SecureRandom());
        } else {
            random1 = Identity(new SecureRandom());
            random2 = Identity(new Random());
        }

        byte[] ivBytes = new byte[16];
        random2.nextBytes(ivBytes);

        IvParameterSpec iv = new IvParameterSpec(ivBytes);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static Random Identity(Random r){
        return r;
    }
}