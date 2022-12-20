package main.java.org.cambench.cap.pathsensitivity.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher;
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        int choice = 0;

        if(choice > 1) {
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        } else {
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        }

        cipher.init(Cipher.ENCRYPT_MODE, keyGen.generateKey());
    }
}