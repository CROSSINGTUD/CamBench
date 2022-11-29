package main.java.org.cambench.cap.mixedsensitivities.fieldpath.falsepositive.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ConfigClass configClass = new ConfigClass();
        configClass.algoConfig1 = "AES/ECB/PKCS5Padding";
        configClass.algoConfig2 = "AES/CBC/PKCS5Padding";

        int condition = 1;
        Cipher cipher;

        if(condition > 1){
            cipher = Cipher.getInstance(configClass.algoConfig1);
        } else {
            cipher = Cipher.getInstance(configClass.algoConfig2);
        }
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class ConfigClass{
        public String algoConfig1;
        public String algoConfig2;
    }
}