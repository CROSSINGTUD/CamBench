package main.java.org.cambench.cap.mixedsensitivities.inter2object.truepositive.insecurerandom;

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
        RandomClass1 randomClass1 = new RandomClass1(new SecureRandom());
        RandomClass1 randomClass2 = new RandomClass1(new Random());

        method1(randomClass2.randomGenerator);
    }

    public static void method1(Random randomGenerator) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        byte[] ivBytes = new byte[16];

        Random random = randomGenerator;
        random.nextBytes(ivBytes);

        IvParameterSpec iv = new IvParameterSpec(ivBytes);

        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }
}

class RandomClass1 {
    Random randomGenerator;

    public RandomClass1(Random randGenerator) {
        randomGenerator = randGenerator;
    }
}