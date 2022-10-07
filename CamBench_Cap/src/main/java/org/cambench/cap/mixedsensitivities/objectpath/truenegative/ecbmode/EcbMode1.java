package main.java.org.cambench.cap.mixedsensitivities.objectpath.truenegative.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass1 algoConfig1 = new ConfigClass1("AES/ECB/PKCS5Padding");
        ConfigClass1 algoConfig2 = new ConfigClass1("AES/CBC/PKCS5Padding");
        Cipher cipher;

        int condition = 1;

        if(condition > 2){
            cipher = Cipher.getInstance(algoConfig1.algorithmConfig);
        } else {
            cipher = Cipher.getInstance(algoConfig2.algorithmConfig);
        }

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