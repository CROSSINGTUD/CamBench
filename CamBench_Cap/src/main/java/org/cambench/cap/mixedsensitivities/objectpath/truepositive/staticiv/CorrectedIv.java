package main.java.org.cambench.cap.mixedsensitivities.objectpath.truepositive.staticiv;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class CorrectedIv {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();
        IvParameterSpec iv;

        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        IvClass ivObject2 = new IvClass(randomBytes);
        iv = new IvParameterSpec(ivObject2.ivBytes);

        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static class IvClass {
        byte[] ivBytes;

        public IvClass(String ivString){
            ivBytes = ivString.getBytes();
        }

        public IvClass(byte[] bytes){ ivBytes = bytes; }
    }
}