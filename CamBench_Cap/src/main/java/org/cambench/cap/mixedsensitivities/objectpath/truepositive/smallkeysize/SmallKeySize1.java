package main.java.org.cambench.cap.mixedsensitivities.objectpath.truepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA");
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");

        SizeClass sizeObject1 = new SizeClass(512);
        SizeClass sizeObject2 = new SizeClass(2048);
        int condition = 1;

        if(condition < 3){
            keyGen.initialize(sizeObject1.keySize);
        } else {
            keyGen.initialize(sizeObject2.keySize);
        }

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