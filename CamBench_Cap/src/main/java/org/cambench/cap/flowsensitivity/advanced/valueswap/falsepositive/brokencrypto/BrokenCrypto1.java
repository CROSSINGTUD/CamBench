package main.java.org.cambench.cap.flowsensitivity.advanced.valueswap.falsepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algorithm1 = "Blowfish";
        String algorithm2 = "AES/CBC/PKCS5Padding";
        String swapper;

        swapper = algorithm1;
        algorithm1 = algorithm2;
        algorithm2 = swapper;
        algorithm2 = algorithm1;

        Cipher cipher = Cipher.getInstance(algorithm2);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}