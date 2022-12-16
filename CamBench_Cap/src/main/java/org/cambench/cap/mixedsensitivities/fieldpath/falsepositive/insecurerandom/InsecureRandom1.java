package main.java.org.cambench.cap.mixedsensitivities.fieldpath.falsepositive.insecurerandom;

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

        RandomClass randomClass = new RandomClass();
        randomClass.randomGenerator1 = new Random();
        randomClass.randomGenerator2 = new SecureRandom();

        byte[] ivBytes = new byte[16];
        int condition = 1;

        if(condition > 0) {
            randomClass.randomGenerator2.nextBytes(ivBytes);
        } else {
            randomClass.randomGenerator1.nextBytes(ivBytes);
        }

        IvParameterSpec iv = new IvParameterSpec(ivBytes);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static class RandomClass{
        public Random randomGenerator1;
        public Random randomGenerator2;
    }
}