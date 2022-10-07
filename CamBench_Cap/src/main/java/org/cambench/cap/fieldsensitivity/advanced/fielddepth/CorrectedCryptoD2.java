package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CorrectedCryptoD2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass cryptoClass = new CryptoClass();
        cryptoClass.selfObject1 = new CryptoClass();
        cryptoClass.selfObject2 = new CryptoClass();
        cryptoClass.selfObject1.cipher = "AES/CBC/PKCS5Padding";

        Cipher cipher = Cipher.getInstance(cryptoClass.selfObject1.cipher);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
class CryptoClass{
    public CryptoClass selfObject1;
    public CryptoClass selfObject2;
    public String cipher;
}