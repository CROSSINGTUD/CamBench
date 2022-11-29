package main.java.org.cambench.cap.mixedsensitivities.flowobject.falsepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA");

        SizeClass sizeObject1 = new SizeClass();
        SizeClass sizeObject2 = new SizeClass();
        sizeObject1.keySize = 512;
        sizeObject2.keySize = 512;
        sizeObject1.keySize = 2048;


        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(sizeObject1.keySize);
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }

    public static class SizeClass {
        int keySize;
    }
}