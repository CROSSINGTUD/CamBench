package main.java.org.cambench.cap.interprocedural2.truepositive.pbeparameters;

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
        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(saltArray,iterationCount);
    }
}