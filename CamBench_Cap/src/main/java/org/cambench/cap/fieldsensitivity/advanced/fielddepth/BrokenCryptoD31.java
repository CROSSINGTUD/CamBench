package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoD31 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass3 cryptoClass = new CryptoClass3();
        cryptoClass.selfObject1 = new CryptoClass3();
        cryptoClass.selfObject2 = new CryptoClass3();
        cryptoClass.selfObject1.selfObject1 = new CryptoClass3();
        cryptoClass.selfObject1.selfObject2 = new CryptoClass3();
        cryptoClass.selfObject1.selfObject1.cipher = "Blowfish";
        cryptoClass.selfObject1.selfObject2.cipher = "AES";

        Cipher cipher = Cipher.getInstance(cryptoClass.selfObject1.selfObject1.cipher);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass.selfObject1.selfObject1.cipher);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
 class CryptoClass3{
    public CryptoClass3 selfObject1;
    public CryptoClass3 selfObject2;
    public String cipher;
}