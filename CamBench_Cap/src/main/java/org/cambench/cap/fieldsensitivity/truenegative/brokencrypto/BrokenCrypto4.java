package main.java.org.cambench.cap.fieldsensitivity.truenegative.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto4 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass4 cryptoClass = new CryptoClass4();
        cryptoClass.cipher1 = "RC4";
        cryptoClass.cipher2 = "AES/CBC/PKCS5Padding";

        Cipher cipher = Cipher.getInstance(cryptoClass.cipher2);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
class CryptoClass4{
    public String cipher1;
    public String cipher2;
}