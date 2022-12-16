package main.java.org.cambench.cap.interprocedural2.truepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;

public class PBEParameters1 {
    public static void main(String[] args) {

        byte[] salt = {123};
        int iterations = 20000;
        method1(salt,iterations);
    }

    public static void method1(byte[] saltArray, int iterationCount) {
        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(saltArray,iterationCount);
    }
}