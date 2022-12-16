package main.java.org.cambench.cap.flowsensitivity.falsepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        byte[] salt = new byte[]{123};
        salt = randomBytes;
        int iterations = 20000;

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt,iterations);
    }
}