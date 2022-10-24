package main.java.org.cambench.cap.mixedsensitivities.inter2object.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass1 algoConfig1 = new ConfigClass1("AES/ECB/PKCS5Padding");
        ConfigClass1 algoConfig2 = new ConfigClass1("AES/CBC/PKCS5Padding");

        method1(algoConfig1.algorithmConfig);
    }

    public static void method1(String algorithmConfig) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algorithmConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}

class ConfigClass1 {
    String algorithmConfig;

    public ConfigClass1(String algoConfig){
        algorithmConfig = algoConfig;
    }
}