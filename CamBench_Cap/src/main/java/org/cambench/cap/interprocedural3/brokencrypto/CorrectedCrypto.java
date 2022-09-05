package main.java.org.cambench.cap.interprocedural3.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CorrectedCrypto {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algo = "AES";
        method1(algo);
    }

    public static void method1(String algo) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algorithm = algo;
        method2(algorithm);
    }

    public static void method2(String algorithm) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String algoConfig = String.join("/", algorithm,"CBC","PKCS5Padding");
        Cipher cipher = Cipher.getInstance(algoConfig);
        KeyGenerator keyGen = KeyGenerator.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
