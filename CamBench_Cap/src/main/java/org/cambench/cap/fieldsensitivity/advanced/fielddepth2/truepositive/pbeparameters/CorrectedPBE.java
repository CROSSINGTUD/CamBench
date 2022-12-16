package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth2.truepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class CorrectedPBE {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomSalt = new byte[16];
        secureRandom.nextBytes(randomSalt);

        ParameterClass paramClass = new ParameterClass();
        paramClass.selfObject = new ParameterClass();
        paramClass.selfObject.salt2 = randomSalt;

        int iterations = 20000;
        PBEParameterSpec pbeParameterSpecSpec = new PBEParameterSpec(paramClass.selfObject.salt2,iterations);
    }

    public static class ParameterClass{
        public ParameterClass selfObject;
        public byte[] salt1;
        public byte[] salt2;
    }
}