package main.java.org.cambench.cap.mixedsensitivities.fieldpath.truenegative.staticiv;

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

        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        IvClass ivClass = new IvClass();
        int condition = 1;

        if(condition > 1) {
            ivClass.ivBytes1 = "abcdefghijklmnop".getBytes();
            ivClass.ivBytes2 = randomBytes;
        } else {
            ivClass.ivBytes1 = randomBytes;
            ivClass.ivBytes2 = "abcdefghijklmnop".getBytes();
        }

        IvParameterSpec iv = new IvParameterSpec(ivClass.ivBytes1);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static class IvClass{
        public byte[] ivBytes1;
        public byte[] ivBytes2;
    }
}