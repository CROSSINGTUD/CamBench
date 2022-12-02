package main.java.org.cambench.cap.mixedsensitivities.inter2path.truepositive.smallkeysize;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class CorrectedKeySize {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        method1(2048);
    }

    public static void method1(int keySize) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");

        keyGen.initialize(keySize);
        KeyPair keyPair = keyGen.generateKeyPair();
        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
    }
}
