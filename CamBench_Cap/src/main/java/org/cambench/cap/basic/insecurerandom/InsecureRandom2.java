package main.java.org.cambench.cap.basic.insecurerandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class InsecureRandom2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");

        byte[] ivBytes = new byte[16];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.setSeed(123);
        secureRandom.nextBytes(ivBytes);

        IvParameterSpec iv = new IvParameterSpec(ivBytes);

        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }
}