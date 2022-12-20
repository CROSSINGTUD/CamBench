package main.java.org.cambench.cap.fieldsensitivity.advanced.fielddepth3.truepositive.pbeparameters;

import javax.crypto.spec.PBEParameterSpec;
import java.security.SecureRandom;

public class PBEParameters1 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] randomSalt = new byte[16];
        secureRandom.nextBytes(randomSalt);

        ParameterClass paramClass = new ParameterClass();
        paramClass.selfObject = new ParameterClass();
        paramClass.selfObject.selfObject = new ParameterClass();
        paramClass.selfObject.selfObject.salt1 = new byte[]{123};
        paramClass.selfObject.selfObject.salt2 = randomSalt;

        int iterations = 20000;
        PBEParameterSpec pbeParameterSpecSpec = new PBEParameterSpec(paramClass.selfObject.selfObject.salt1,iterations);
    }

    public static class ParameterClass{
        public ParameterClass selfObject;
        public byte[] salt1;
        public byte[] salt2;
    }
}