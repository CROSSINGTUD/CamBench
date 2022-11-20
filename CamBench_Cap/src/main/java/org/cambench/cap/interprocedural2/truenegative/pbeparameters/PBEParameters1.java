package main.java.org.cambench.cap.interprocedural2.truenegative.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {

        byte[] salt = {123};
        int iterations = 20000;
        method1(salt,iterations);
    }

    public static void method1(byte[] saltArray, int iterationCount) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(randomBytes,iterationCount);
    }
}