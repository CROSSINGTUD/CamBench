package main.java.org.cambench.cap.mixedsensitivities.fieldpath.truenegative.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto1 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass1 cryptoClass = new CryptoClass1();
        cryptoClass.cipher1 = "Blowfish";
        cryptoClass.cipher2 = "AES/CBC/PKCS5Padding";

        Cipher cipher;
        int condition = 1;

        if (condition > 0) {
            cipher = Cipher.getInstance(cryptoClass.cipher2);
        } else{
            cipher = Cipher.getInstance(cryptoClass.cipher1);
        }
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
class CryptoClass1{
    public String cipher1;
    public String cipher2;
}