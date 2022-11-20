package main.java.org.cambench.cap.pathsensitivity.advanced.pathdepth2.truenegative.smallkeysize;

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
        int condition = 1;
        int keySize;

        if(condition > 0) {
            if(condition > 2){
                keySize = 512;
            } else {
                keySize = 2048;
            }
        } else {
            keySize = 1024;
        }

        keyGen.initialize(keySize);
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }
}