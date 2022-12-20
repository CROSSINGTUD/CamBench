package main.java.org.cambench.cap.mixedsensitivities.fieldobject.truepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");

        SizeClass1 sizeClass1 = new SizeClass1();
        SizeClass1 sizeClass2 = new SizeClass1();
        sizeClass1.keySize1 = 1024;
        sizeClass1.keySize2 = 2048;
        sizeClass2.keySize1 = 2048;
        sizeClass2.keySize2 = 1024;

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(sizeClass2.keySize2);
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }

    public static class SizeClass1{
        public int keySize1;
        public int keySize2;
    }
}