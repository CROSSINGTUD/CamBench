package main.java.org.cambench.cap.objectsensitivity.truepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters2 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];

        secureRandom.nextBytes(salt);
        IterationClass iterationClass1 = new IterationClass(10);
        IterationClass iterationClass2 = new IterationClass(20000);

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt,iterationClass1.iterations);
    }

    public static class IterationClass {
        int iterations;
        public IterationClass(int i) { iterations = i; }
    }
}