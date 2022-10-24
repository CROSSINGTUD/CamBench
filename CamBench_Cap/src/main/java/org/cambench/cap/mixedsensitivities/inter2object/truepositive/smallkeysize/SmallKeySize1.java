package main.java.org.cambench.cap.mixedsensitivities.inter2object.truepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        SizeClass1 sizeObject1 = new SizeClass1(512);
        SizeClass1 sizeObject2 = new SizeClass1(2048);

        method1(sizeObject1.keySize);
    }

    public static void method1(int keySize) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA");
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(keySize);
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