package main.java.org.cambench.cap.interprocedural2.truenegative.pbeparameters;

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

    public static void method1(byte[] saltArray, int iterationCount) {
        int newIterations = 20000;
        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(saltArray,newIterations);
    }
}