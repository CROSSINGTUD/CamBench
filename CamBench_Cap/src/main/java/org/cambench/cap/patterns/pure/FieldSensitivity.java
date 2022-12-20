package main.java.org.cambench.cap.patterns.pure;

public class FieldSensitivity {

    public static void main(String[] args) {
        Class1 classObject = new Class1();
        classObject.value1 = "secret value";
        classObject.value2 = "non secret value";

        System.out.println(classObject.value1);
    }

    public static class Class1 {
        String value1;
        String value2;
    }
}
