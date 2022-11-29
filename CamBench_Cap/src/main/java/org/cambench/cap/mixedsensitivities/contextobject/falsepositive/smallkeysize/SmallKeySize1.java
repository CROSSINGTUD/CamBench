package main.java.org.cambench.cap.mixedsensitivities.contextobject.falsepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA");

        SizeClass sizeObject1 = GetObject(512);
        SizeClass sizeObject2 = GetObject(2048);

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(sizeObject2.keySize);
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }

    public static SizeClass GetObject(int size){
        SizeClass object = new SizeClass();
        object.keySize = size;
        return object;
    }

    public static class SizeClass {
        int keySize;
    }
}