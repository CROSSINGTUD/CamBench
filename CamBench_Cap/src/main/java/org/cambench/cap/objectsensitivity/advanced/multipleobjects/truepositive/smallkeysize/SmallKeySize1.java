package main.java.org.cambench.cap.objectsensitivity.advanced.multipleobjects.truepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");

        SizeClass sizeObject1 = new SizeClass(128);
        SizeClass sizeObject2 = new SizeClass(256);
        SizeClass sizeObject3 = new SizeClass(512);
        SizeClass sizeObject4 = new SizeClass(1024);
        SizeClass sizeObject5 = new SizeClass(2048);

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(sizeObject4.keySize);
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