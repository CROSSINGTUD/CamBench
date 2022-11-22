package main.java.org.cambench.cap.mixedsensitivities.contextfield.truenegative.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass configClass = new ConfigClass();
        configClass.algoConfig1 = Identity("AES/ECB/PKCS5Padding");
        configClass.algoConfig2 = Identity("AES/CBC/PKCS5Padding");

        Cipher cipher = Cipher.getInstance(configClass.algoConfig1);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static String Identity(String s){
        return s;
    }

    public static class ConfigClass{
        public String algoConfig1;
        public String algoConfig2;
    }
}