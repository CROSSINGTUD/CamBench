package main.java.org.cambench.cap.mixedsensitivities.objectpath.truepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA");

        SizeClass sizeObject1;
        SizeClass sizeObject2;
        int condition = 1;

        if(condition < 2){
            sizeObject1 = new SizeClass(1024);
            sizeObject2 = new SizeClass(2048);
        } else {
            sizeObject1 = new SizeClass(2048);
            sizeObject2 = new SizeClass(1024);
        }

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(sizeObject1.keySize);
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }

    public static class SizeClass {
        int keySize;

        public SizeClass(int size){
            keySize = size;
        }
    }
}