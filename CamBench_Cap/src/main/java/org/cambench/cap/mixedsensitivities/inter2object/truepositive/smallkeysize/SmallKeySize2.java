package main.java.org.cambench.cap.mixedsensitivities.inter2object.truepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        SizeClass2 sizeObject1 = new SizeClass2(1024);
        SizeClass2 sizeObject2 = new SizeClass2(2048);

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

class SizeClass2 {
    int keySize;

    public SizeClass2(int size){
        keySize = size;
    }
}