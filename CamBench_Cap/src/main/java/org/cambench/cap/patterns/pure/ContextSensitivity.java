package main.java.org.cambench.cap.patterns.pure;

public class ContextSensitivity {
    public static void main(String[] args){
        String value1 = Identity("secret value");
        String value2 = Identity("non secret value");

        System.out.println(value1);
    }

    public static String Identity(String s){
        return s;
    }
}