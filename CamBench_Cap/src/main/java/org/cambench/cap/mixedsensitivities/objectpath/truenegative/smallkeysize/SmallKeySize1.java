package main.java.org.cambench.cap.mixedsensitivities.objectpath.truenegative.smallkeysize;

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

        SizeClass1 sizeObject1 = new SizeClass1(512);
        SizeClass1 sizeObject2 = new SizeClass1(2048);
        int condition = 1;

        if(condition == 3){
            keyGen.initialize(sizeObject1.keySize);
        } else {
            keyGen.initialize(sizeObject2.keySize);
        }
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }
}

class SizeClass1 {
    int keySize;

    public SizeClass1(int size){
        keySize = size;
    }
}