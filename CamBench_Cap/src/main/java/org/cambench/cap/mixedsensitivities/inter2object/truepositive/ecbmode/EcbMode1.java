package main.java.org.cambench.cap.mixedsensitivities.inter2object.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass algoConfig1 = new ConfigClass("AES/ECB/PKCS5Padding");
        ConfigClass algoConfig2 = new ConfigClass("AES/CBC/PKCS5Padding");

        method1(algoConfig1.algorithmConfig);
    }

    public static void method1(String algorithmConfig) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algorithmConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class ConfigClass {
        String algorithmConfig;

        public ConfigClass(String algoConfig){
            algorithmConfig = algoConfig;
        }
    }
}