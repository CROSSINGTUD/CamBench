package main.java.org.cambench.cap.mixedsensitivities.fieldobject.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass1 configClass1 = new ConfigClass1();
        ConfigClass1 configClass2 = new ConfigClass1();
        configClass1.algoConfig1 = "AES/ECB/PKCS5Padding";
        configClass1.algoConfig2 = "AES/CBC/PKCS5Padding";
        configClass2.algoConfig1 = "AES/CBC/PKCS5Padding";
        configClass2.algoConfig2 = "AES/ECB/PKCS5Padding";

        Cipher cipher = Cipher.getInstance(configClass2.algoConfig2);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class ConfigClass1{
        public String algoConfig1;
        public String algoConfig2;
    }
}