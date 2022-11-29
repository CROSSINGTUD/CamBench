package main.java.org.cambench.cap.mixedsensitivities.contextobject.falsepositive.insecurerandom;

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

        RandomClass randomClass1 = GetObject(new SecureRandom());
        RandomClass randomClass2 = GetObject(new Random());

        byte[] ivBytes = new byte[16];
        Random random = randomClass1.randomGenerator;
        random.nextBytes(ivBytes);

        IvParameterSpec iv = new IvParameterSpec(ivBytes);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static RandomClass GetObject(Random random){
        RandomClass object = new RandomClass();
        object.randomGenerator = random;
        return object;
    }

    public static class RandomClass {
        Random randomGenerator;
    }
}