package main.java.org.cambench.cap.mixedsensitivities.contextobject.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CorrectedEcbMode {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass algoConfig2 = GetObject("AES/CBC/PKCS5Padding");

        Cipher cipher = Cipher.getInstance(algoConfig2.algorithmConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static ConfigClass GetObject(String config){
        ConfigClass object = new ConfigClass();
        object.algorithmConfig = config;
        return object;
    }

    public static class ConfigClass {
        String algorithmConfig;
    }
}