package main.java.org.cambench.cap.flowsensitivity.advanced.valueswap.truenegative.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] array1 = new byte[16];
        secureRandom.nextBytes(array1);
        byte[] array2 = new byte[]{123};
        byte[] swapper;

        swapper = array1;
        array1 = array2;
        array2 = swapper;
        array1 = array2;

        int iterations = 20000;
        PBEParameterSpec pbeParameterSpec = new PBEParameterSpec(array1, iterations);
    }
}