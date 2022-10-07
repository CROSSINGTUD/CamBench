package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class CorrectedCryptoD3 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CorrectedCryptoClass2 cryptoClass = new CorrectedCryptoClass2();
        cryptoClass.selfObject1 = new CorrectedCryptoClass2();
        cryptoClass.selfObject2 = new CorrectedCryptoClass2();
        cryptoClass.selfObject1.selfObject1 = new CorrectedCryptoClass2();
        cryptoClass.selfObject1.selfObject1.cipher = "AES/CBC/PKCS5Padding";

        Cipher cipher = Cipher.getInstance(cryptoClass.selfObject1.selfObject1.cipher);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
class CorrectedCryptoClass2{
    public CorrectedCryptoClass2 selfObject1;
    public CorrectedCryptoClass2 selfObject2;
    public String cipher;
}