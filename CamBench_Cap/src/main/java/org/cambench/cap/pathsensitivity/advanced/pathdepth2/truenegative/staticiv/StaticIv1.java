package main.java.org.cambench.cap.pathsensitivity.advanced.pathdepth2.truenegative.staticiv;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class StaticIv1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();

        int condition = 1;
        byte[] ivBytes = new byte[16];

        if(condition > 0) {
            if(condition < 3) {
                secureRandom.nextBytes(ivBytes);
            } else {
                ivBytes = new byte[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
            }
        } else {
            ivBytes = new byte[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
        }

        IvParameterSpec iv = new IvParameterSpec(ivBytes);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }
}