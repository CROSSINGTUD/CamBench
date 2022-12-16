package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth2.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass cryptoClass = new CryptoClass();
        cryptoClass.selfObject = new CryptoClass();
        cryptoClass.selfObject.cipher1 = "AES/CBC/PKCS5Padding";
        cryptoClass.selfObject.cipher2 = "DES";

        Cipher cipher = Cipher.getInstance(cryptoClass.selfObject.cipher2);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass.selfObject.cipher2);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }

    public static class CryptoClass{
        public CryptoClass selfObject;
        public String cipher1;
        public String cipher2;
    }
}