package main.java.org.cambench.cap.interprocedural3.truepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters2 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];

        secureRandom.nextBytes(salt);
        int iterations = 10;

        method1(salt,iterations);
    }

    public static void method1(byte[] salt, int iterations) {
        byte[] saltArray = salt;
        int iterationCount = iterations;
        method2(saltArray,iterationCount);
    }

    public static void method2(byte[] saltArray, int iterationCount) {
        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(saltArray,iterationCount);
    }
}