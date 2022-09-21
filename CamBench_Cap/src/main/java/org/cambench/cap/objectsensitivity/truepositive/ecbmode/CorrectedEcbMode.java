package main.java.org.cambench.cap.objectsensitivity.truepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CorrectedEcbMode {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass algoConfig1 = new ConfigClass("AES/CBC/PKCS5Padding");

        Cipher cipher = Cipher.getInstance(algoConfig1.algorithmConfig);
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
