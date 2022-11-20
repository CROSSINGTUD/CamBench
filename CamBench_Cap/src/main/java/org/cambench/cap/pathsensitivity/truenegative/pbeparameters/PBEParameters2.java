package main.java.org.cambench.cap.pathsensitivity.truenegative.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters2 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];
        int condition = 0;
        int iterations;
        secureRandom.nextBytes(salt);

        if(condition > 1) {
            iterations = 10;
        } else {
            iterations = 10000;
        }

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt,iterations);
    }
}