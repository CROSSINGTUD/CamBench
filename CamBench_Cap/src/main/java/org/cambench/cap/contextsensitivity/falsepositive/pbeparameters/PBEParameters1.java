package main.java.org.cambench.cap.contextsensitivity.falsepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        byte[] salt1 = Identity(new byte[]{123});
        byte[] salt2 = Identity(randomBytes);

        int iterations = 20000;

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt2,iterations);
    }

    public static byte[] Identity(byte[] i) {
        return i;
    }
}