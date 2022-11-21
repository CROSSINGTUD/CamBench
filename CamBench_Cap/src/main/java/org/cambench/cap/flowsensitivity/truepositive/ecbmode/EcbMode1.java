package main.java.org.cambench.cap.flowsensitivity.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algorithm = "AES/ECB/PKCS5Padding";

        Cipher cipher = Cipher.getInstance(algorithm);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());

        algorithm = "AES/CBC/PKCS5Padding";
    }
}