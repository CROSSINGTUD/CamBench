package main.java.org.cambench.cap.mixedsensitivities.fieldflow.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass1 configClass = new ConfigClass1();
        configClass.algoConfig1 = "AES/ECB/PKCS5Padding";
        configClass.algoConfig2 = "AES/CBC/PKCS5Padding";

        Cipher cipher = Cipher.getInstance(configClass.algoConfig1);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());

        configClass.algoConfig1 = "AES/CBC/PKCS5Padding";
    }

    public static class ConfigClass1{
        public String algoConfig1;
        public String algoConfig2;
    }
}