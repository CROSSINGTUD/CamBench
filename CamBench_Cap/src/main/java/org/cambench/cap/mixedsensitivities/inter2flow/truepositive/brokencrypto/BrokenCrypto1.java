package main.java.org.cambench.cap.mixedsensitivities.inter2flow.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algo = "Blowfish";
        method1(algo);
        algo = "AES/CBC/PKCS5Padding";
    }

    public static void method1(String algo) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algo);
        KeyGenerator keyGen = KeyGenerator.getInstance(algo);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}