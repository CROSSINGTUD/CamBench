package main.java.org.cambench.cap.pathsensitivity.truenegative.staticiv;

import javax.crypto.*;
import java.security.*;
import javax.crypto.spec.IvParameterSpec;

public class StaticIv2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();

        int condition = 1;
        byte[] ivBytes = new byte[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};

        if(condition > 0)
            secureRandom.nextBytes(ivBytes);

        IvParameterSpec iv = new IvParameterSpec(ivBytes);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }
}
