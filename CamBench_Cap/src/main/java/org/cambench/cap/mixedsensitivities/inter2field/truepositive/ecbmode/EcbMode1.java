package main.java.org.cambench.cap.mixedsensitivities.inter2field.truepositive.ecbmode;

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

        method1(configClass.algoConfig1);
    }

    public static void method1(String algoConfig) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algoConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
class ConfigClass1{
   public String algoConfig1;
   public String algoConfig2;
}