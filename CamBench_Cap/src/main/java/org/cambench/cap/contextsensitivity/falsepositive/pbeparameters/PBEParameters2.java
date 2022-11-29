package main.java.org.cambench.cap.contextsensitivity.falsepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters2 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];

        secureRandom.nextBytes(salt);
        int iterations1 = Identity(10);
        int iterations2 = Identity(20000);

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt,iterations2);
    }

    public static int Identity(int i) {
        return i;
    }
}