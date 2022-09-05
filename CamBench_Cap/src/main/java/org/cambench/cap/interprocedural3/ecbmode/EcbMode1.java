package main.java.org.cambench.cap.interprocedural3.ecbmode;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class EcbMode1 {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algo = "AES";
        String algoConfig = "AES/ECB/PKCS5Padding";
        method1(algo, algoConfig);
    }

    public static void method1(String algo, String algoConfig) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algorithm = algo;
        String algorithmConfig = algoConfig;
        method2(algorithm, algorithmConfig);
    }

    public static void method2(String algorithm, String algorithmConfig) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algorithmConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
