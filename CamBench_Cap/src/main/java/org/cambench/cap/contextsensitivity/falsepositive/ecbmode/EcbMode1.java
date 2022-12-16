package main.java.org.cambench.cap.contextsensitivity.falsepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algo1 = Identity("AES/ECB/PKCS5Padding");
        String algo2 = Identity("AES/CBC/PKCS5Padding");

        Cipher cipher = Cipher.getInstance(algo2);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static String Identity(String s){
        return s;
    }
}