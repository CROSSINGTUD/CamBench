package main.java.org.cambench.cap.contextsensitivity.truenegative.staticiv;

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

        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        byte[] ivBytes1 = Identity(new byte[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'});
        byte[] ivBytes2 = Identity(randomBytes);
        IvParameterSpec iv = new IvParameterSpec(ivBytes2);

        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static byte[] Identity(byte[] b) {return b;}
}