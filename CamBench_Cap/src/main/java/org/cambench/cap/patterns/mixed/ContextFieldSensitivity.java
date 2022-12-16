package main.java.org.cambench.cap.patterns.mixed;

public class ContextFieldSensitivity {
    public static void main(String[] args){
        Class1 classObject = new Class1();
        classObject.value1 = Identity("secret value");
        classObject.value2 = Identity("non secret value");

        System.out.println(classObject.value1);
    }

    public static String Identity(String s){
        return s;
    }

    public static class Class1 {
        String value1;
        String value2;
    }
}