package main.java.org.cambench.cap.fieldsensitivity.truepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);


        SaltClass saltClass = new SaltClass();
        saltClass.salt1 = new byte[]{123};
        saltClass.salt2 = randomBytes;
        int iterations = 20000;

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(saltClass.salt1,iterations);
    }

    public static class SaltClass {
        byte[] salt1;
        byte[] salt2;
    }
}