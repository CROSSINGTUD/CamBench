package main.java.org.cambench.cap.patterns.pure;

public class FlowSensitivity {
    public static void main(String[] args) {
        String value = "secret value";
        System.out.println(value);
        value = "non secret value";
    }
}