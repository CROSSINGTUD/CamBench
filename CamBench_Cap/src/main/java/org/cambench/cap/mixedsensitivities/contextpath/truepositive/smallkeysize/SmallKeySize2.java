package main.java.org.cambench.cap.mixedsensitivities.contextpath.truepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class SmallKeySize2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA");
        int keySize1;
        int keySize2;
        int condition = 1;

        if(condition > 0){
            keySize1 = Identity(1024);
            keySize2 = Identity(2048);
        } else {
            keySize1 = Identity(2048);
            keySize2 = Identity(1024);
        }

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(keySize1);
        KeyPair keyPair = keyGen.generateKeyPair();

        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }

    public static int Identity(int i){
        return i;
    }
}