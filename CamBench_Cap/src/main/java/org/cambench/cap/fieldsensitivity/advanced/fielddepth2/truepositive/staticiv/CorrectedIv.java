package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth2.truepositive.staticiv;

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

        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        IvClass ivClass = new IvClass();
        ivClass.selfObject = new IvClass();
        ivClass.selfObject.ivBytes2 = randomBytes;

        IvParameterSpec iv = new IvParameterSpec(ivClass.selfObject.ivBytes2);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }

    public static class IvClass{
        public IvClass selfObject;
        public byte[] ivBytes1;
        public byte[] ivBytes2;
    }
}