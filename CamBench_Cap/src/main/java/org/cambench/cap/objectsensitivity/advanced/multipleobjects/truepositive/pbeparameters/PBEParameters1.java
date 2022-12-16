package main.java.org.cambench.cap.objectsensitivity.advanced.multipleobjects.truepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes =new byte[16];
        secureRandom.nextBytes(randomBytes);


        SaltClass saltClass1 = new SaltClass(new byte[]{123});
        SaltClass saltClass2 = new SaltClass(randomBytes);
        SaltClass saltClass3 = new SaltClass(new byte[]{123});
        SaltClass saltClass4 = new SaltClass(randomBytes);
        SaltClass saltClass5 = new SaltClass(new byte[]{123});
        int iterations = 20000;

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(saltClass5.salt,iterations);
    }

    public static class SaltClass {
        public byte[] salt;
        public SaltClass(byte[] s){ salt = s; }
    }
}