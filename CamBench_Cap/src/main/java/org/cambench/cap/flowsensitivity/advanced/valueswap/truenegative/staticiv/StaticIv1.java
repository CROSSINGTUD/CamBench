package main.java.org.cambench.cap.flowsensitivity.advanced.valueswap.truenegative.staticiv;

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
        String ivString = "abcdefghijklmnop";

        byte[] array1 = new byte[16];
        secureRandom.nextBytes(array1);
        byte[] array2 = ivString.getBytes();
        byte[] swapper;

        swapper = array2;
        array2 = array1;
        array1 = swapper;
        array1 = array2;

        IvParameterSpec iv = new IvParameterSpec(array1);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }
}