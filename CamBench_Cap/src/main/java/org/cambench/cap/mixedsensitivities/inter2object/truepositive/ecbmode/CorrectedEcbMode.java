package main.java.org.cambench.cap.mixedsensitivities.inter2object.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CorrectedEcbMode {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass algoConfig = new ConfigClass("AES/CBC/PKCS5Padding");

        method1(algoConfig.algorithmConfig);
    }

    public static void method1(String algorithmConfig) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algorithmConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}

class ConfigClass {
    String algorithmConfig;

    public ConfigClass(String algoConfig){
        algorithmConfig = algoConfig;
    }
}