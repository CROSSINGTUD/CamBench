package main.java.org.cambench.cap.fieldsensitivity.falsepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters2 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt);

        IterationClass iterationClass = new IterationClass();
        iterationClass.iterations1 = 10;
        iterationClass.iterations2 = 20000;

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt,iterationClass.iterations2);
    }

    public static class IterationClass {
        int iterations1;
        int iterations2;
    }
}