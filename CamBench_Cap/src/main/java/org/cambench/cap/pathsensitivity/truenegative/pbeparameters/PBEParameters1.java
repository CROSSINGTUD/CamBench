package main.java.org.cambench.cap.pathsensitivity.truenegative.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt;
        int iterations = 20000;
        int condition = 0;

        if(condition > 1) {
            salt = new byte[]{123};
        } else {
            salt = new byte[16];
            secureRandom.nextBytes(salt);
        }

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt,iterations);
    }
}