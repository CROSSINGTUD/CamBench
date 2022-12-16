package main.java.org.cambench.cap.interprocedural3.falsepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {

        byte[] salt = {123};
        int iterations = 20000;
        method1(salt,iterations);
    }

    public static void method1(byte[] salt, int iterations) {
        byte[] saltArray = salt;
        int iterationCount = iterations;
        method2(saltArray,iterationCount);
    }

    public static void method2(byte[] saltArray, int iterationCount) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomBytes = new byte[16];
        secureRandom.nextBytes(randomBytes);

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(randomBytes,iterationCount);
    }
}