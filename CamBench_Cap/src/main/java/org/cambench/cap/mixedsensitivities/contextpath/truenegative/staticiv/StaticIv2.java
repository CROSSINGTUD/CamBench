package main.java.org.cambench.cap.mixedsensitivities.contextpath.truenegative.staticiv;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class StaticIv2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();
        byte[] ivBytes1;
        byte[] ivBytes2;

        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);
        int condition = 1;

        if(condition == 1){
            ivBytes1 = Identity(new byte[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'});
            ivBytes2 = Identity(randomBytes);
        } else {
            ivBytes1 = Identity(randomBytes);
            ivBytes2 = Identity(new byte[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'});
        }

        IvParameterSpec iv = new IvParameterSpec(ivBytes2);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static byte[] Identity(byte[] b) {return b;}
}