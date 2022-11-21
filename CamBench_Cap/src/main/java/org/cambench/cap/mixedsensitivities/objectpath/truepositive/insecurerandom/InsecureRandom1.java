package main.java.org.cambench.cap.mixedsensitivities.objectpath.truepositive.insecurerandom;

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

        RandomClass randomClass1;
        RandomClass randomClass2;
        int condition = 1;

        if(condition > 0){
            randomClass1 = new RandomClass(new SecureRandom());
            randomClass2 = new RandomClass(new Random());
        } else {
            randomClass1 = new RandomClass(new Random());
            randomClass2 = new RandomClass(new SecureRandom());
        }

        byte[] ivBytes = new byte[16];
        Random random = randomClass2.randomGenerator;
        random.nextBytes(ivBytes);

        IvParameterSpec iv = new IvParameterSpec(ivBytes);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static class RandomClass {
        Random randomGenerator;

        public RandomClass(Random randGenerator) {
            randomGenerator = randGenerator;
        }
    }
}