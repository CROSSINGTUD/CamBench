package main.java.org.cambench.cap.mixedsensitivities.fieldpath.falsepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA");
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");

        SizeClass sizeClass = new SizeClass();
        sizeClass.keySize1 = 1024;
        sizeClass.keySize2 = 2048;

        int condition = 1;

        if (condition < 3){
            keyGen.initialize(sizeClass.keySize2);
        } else {
            keyGen.initialize(sizeClass.keySize1);
        }

        KeyPair keyPair = keyGen.generateKeyPair();
        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }

    public static class SizeClass{
        public int keySize1;
        public int keySize2;
    }
}