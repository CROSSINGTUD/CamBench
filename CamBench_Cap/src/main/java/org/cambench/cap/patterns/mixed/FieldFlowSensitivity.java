package main.java.org.cambench.cap.patterns.mixed;

public class FieldFlowSensitivity {
    public static void main(String[] args) {
        Class1 classObject = new Class1();
        classObject.value1 = "secret value";
        classObject.value2 = "non secret value";

        System.out.println(classObject.value1);

        classObject.value1 = "non secret value";
    }

    public static class Class1 {
        String value1;
        String value2;
    }
}