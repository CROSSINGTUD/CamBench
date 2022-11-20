package main.java.org.cambench.cap.contextsensitivity.truepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class CorrectedPBE {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[32];

        secureRandom.nextBytes(salt);
        int iterations = 20000;

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt,iterations);
    }
}