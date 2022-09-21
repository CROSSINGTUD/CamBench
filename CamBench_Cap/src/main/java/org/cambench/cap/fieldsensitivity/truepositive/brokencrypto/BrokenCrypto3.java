package main.java.org.cambench.cap.fieldsensitivity.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto3 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass3 cryptoClass = new CryptoClass3();
        cryptoClass.cipher1 = "RC2";
        cryptoClass.cipher2 = "AES";

        Cipher cipher = Cipher.getInstance(cryptoClass.cipher1);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass.cipher1);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
class CryptoClass3{
    public String cipher1;
    public String cipher2;
}