package main.java.org.cambench.cap.mixedsensitivities.objectpath.truenegative.staticiv;

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
        IvClass2 ivObject1;
        IvClass2 ivObject2;

        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);
        int condition = 1;

        if(condition > 0) {
            ivObject1 = new IvClass2(new byte[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'});
            ivObject2 = new IvClass2(randomBytes);
        } else {
            ivObject1 = new IvClass2(randomBytes);
            ivObject2 = new IvClass2(new byte[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'});
        }

        IvParameterSpec iv = new IvParameterSpec(ivObject2.ivBytes);
        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey(), iv);
    }
}

class IvClass2 {
    byte[] ivBytes;

    public IvClass2(byte[] bytes){
        ivBytes = bytes;
    }
}