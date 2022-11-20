package main.java.org.cambench.cap.interprocedural3.truepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;

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
        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(saltArray,iterationCount);
    }
}