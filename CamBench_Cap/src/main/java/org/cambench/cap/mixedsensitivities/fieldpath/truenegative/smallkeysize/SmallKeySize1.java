package main.java.org.cambench.cap.mixedsensitivities.fieldpath.truenegative.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA");

        SizeClass1 sizeClass = new SizeClass1();

        int condition = 1;

        if(condition == 3){
            sizeClass.keySize1 = 512;
            sizeClass.keySize2 = 2048;
        } else {
            sizeClass.keySize1 = 2048;
            sizeClass.keySize2 = 512;
        }

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(sizeClass.keySize1);
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }
}
class SizeClass1{
    public int keySize1;
    public int keySize2;
}