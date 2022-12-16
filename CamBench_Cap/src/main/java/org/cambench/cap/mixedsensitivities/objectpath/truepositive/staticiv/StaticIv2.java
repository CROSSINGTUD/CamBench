package main.java.org.cambench.cap.mixedsensitivities.objectpath.truepositive.staticiv;

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
        IvClass ivObject1;
        IvClass ivObject2;

        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);
        int condition = 1;

        if(condition > 0) {
            ivObject1 = new IvClass(new byte[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'});
            ivObject2 = new IvClass(randomBytes);
        } else {
            ivObject1 = new IvClass(randomBytes);
            ivObject2 = new IvClass(new byte[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'});
        }

        IvParameterSpec iv = new IvParameterSpec(ivObject1.ivBytes);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static class IvClass {
        byte[] ivBytes;

        public IvClass(byte[] bytes){
            ivBytes = bytes;
        }
    }
}