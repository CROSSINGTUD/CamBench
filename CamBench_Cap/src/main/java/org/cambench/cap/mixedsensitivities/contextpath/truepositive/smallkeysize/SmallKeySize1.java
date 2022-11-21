package main.java.org.cambench.cap.mixedsensitivities.contextpath.truepositive.smallkeysize;

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
        int keySize1 = Identity(512);
        int keySize2 = Identity(2048);
        int condition = 1;

        if(condition > 1){
            keyGen.initialize(keySize1);
        } else {
            keyGen.initialize(keySize2);
        }

        KeyPair keyPair = keyGen.generateKeyPair();
        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }

    public static int Identity(int i){
        return i;
    }
}