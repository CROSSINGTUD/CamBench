package main.java.org.cambench.cap.mixedsensitivities.fieldflow.truepositive.staticiv;

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

        IvClass1 ivClass = new IvClass1();
        ivClass.ivBytes1 = "abcdefghijklmnop".getBytes();
        ivClass.ivBytes2 = randomBytes;

        IvParameterSpec iv = new IvParameterSpec(ivClass.ivBytes1);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);

        ivClass.ivBytes1 = randomBytes;
    }

    public static class IvClass1{
        public byte[] ivBytes1;
        public byte[] ivBytes2;
    }
}