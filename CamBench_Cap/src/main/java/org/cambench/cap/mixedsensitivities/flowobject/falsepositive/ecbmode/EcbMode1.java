package main.java.org.cambench.cap.mixedsensitivities.flowobject.falsepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass algoConfig1 = new ConfigClass();
        ConfigClass algoConfig2 = new ConfigClass();
        algoConfig1.algorithmConfig = "AES/ECB/PKCS5Padding";
        algoConfig2.algorithmConfig = "AES/ECB/PKCS5Padding";
        algoConfig1.algorithmConfig = "AES/CBC/PKCS5Padding";

        Cipher cipher = Cipher.getInstance(algoConfig1.algorithmConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class ConfigClass {
        String algorithmConfig;
    }
}