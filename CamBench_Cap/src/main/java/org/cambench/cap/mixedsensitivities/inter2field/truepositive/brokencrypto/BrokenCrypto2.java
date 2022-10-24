package main.java.org.cambench.cap.mixedsensitivities.inter2field.truepositive.brokencrypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class BrokenCrypto2 {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        CryptoClass2 cryptoClass = new CryptoClass2();
        cryptoClass.cipher1 = "DES";
        cryptoClass.cipher2 = "AES";

        method1(cryptoClass.cipher1);
    }

    public static void method1(String algo) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algo);
        KeyGenerator keyGen = KeyGenerator.getInstance(algo);
        cipher.init(Cipher.ENCRYPT_MODE,keyGen.generateKey());
    }
}
class CryptoClass2{
    public String cipher1;
    public String cipher2;
}