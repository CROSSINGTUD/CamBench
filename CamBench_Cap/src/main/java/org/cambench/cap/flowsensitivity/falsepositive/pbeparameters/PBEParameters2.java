package main.java.org.cambench.cap.flowsensitivity.falsepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters2 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];

        secureRandom.nextBytes(salt);
        int iterations = 10;
        iterations = 20000;

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt,iterations);
    }
}