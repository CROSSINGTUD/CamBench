package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCryptoD22 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass2 cryptoClass = new CryptoClass2();
        cryptoClass.selfObject1 = new CryptoClass2();
        cryptoClass.selfObject2 = new CryptoClass2();
        cryptoClass.selfObject1.cipher = "DES";
        cryptoClass.selfObject2.cipher = "AES";

        Cipher cipher = Cipher.getInstance(cryptoClass.cipher);
        KeyGenerator keyGen = KeyGenerator.getInstance(cryptoClass.cipher);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
class CryptoClass2{
    public CryptoClass2 selfObject1;
    public CryptoClass2 selfObject2;
    public String cipher;
}