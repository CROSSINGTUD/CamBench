package main.java.org.cambench.cap.basic.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;

public class PBEParameters1 {
    public static void main(String[] args) {

        byte[] salt = {123};
        int iterations = 20000;

        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(salt,iterations);
    }
}