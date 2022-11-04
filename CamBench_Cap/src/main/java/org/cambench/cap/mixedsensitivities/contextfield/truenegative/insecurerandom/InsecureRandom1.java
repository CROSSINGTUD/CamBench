package main.java.org.cambench.cap.mixedsensitivities.contextfield.truenegative.insecurerandom;

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

        RandomClass1 randomClass = new RandomClass1();
        randomClass.randomGenerator1 = Identity(new Random());
        randomClass.randomGenerator2 = Identity(new SecureRandom());

        byte[] ivBytes = new byte[16];
        Random random = randomClass.randomGenerator2;
        random.nextBytes(ivBytes);

        IvParameterSpec iv = new IvParameterSpec(ivBytes);

        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static Random Identity(Random r){
        return r;
    }
}

class RandomClass1{
    public Random randomGenerator1;
    public Random randomGenerator2;
}