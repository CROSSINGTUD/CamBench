package main.java.org.cambench.cap.patterns.mixed;

public class ContextFlowSensitivity {
    public static void main(String[] args){
        String value1 = Identity("secret value");
        String value2 = Identity("non secret value");

        System.out.println(value2);

        value2 = Identity("secret value");
    }

    public static String Identity(String s){
        return s;
    }
}
