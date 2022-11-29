package main.java.org.cambench.cap.contextsensitivity.advanced.callsites5.falsepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA");

        int keySize1 = Identity(128);
        int keySize2 = Identity(256);
        int keySize3 = Identity(512);
        int keySize4 = Identity(1024);
        int keySize5 = Identity(2048);

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(keySize5);
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }

    public static int Identity(int i){
        return i;
    }
}