package main.java.org.cambench.cap.patterns.pure;

public class FlowSensitivity {
    public static void main(String[] args) {
        String value = "non secret value";
        System.out.println(value);
        value = "secret value";
    }
}