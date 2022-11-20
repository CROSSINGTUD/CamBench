package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth3.truepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class CorrectedKeySize {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA");

        SizeClass sizeClass = new SizeClass();
        sizeClass.selfObject = new SizeClass();
        sizeClass.selfObject.selfObject = new SizeClass();
        sizeClass.selfObject.selfObject.keySize2 = 2048;

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(sizeClass.selfObject.selfObject.keySize2);
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }

    public static class SizeClass{
        public SizeClass selfObject;
        public int keySize1;
        public int keySize2;
    }
}