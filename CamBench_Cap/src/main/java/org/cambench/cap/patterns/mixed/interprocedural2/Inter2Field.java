package main.java.org.cambench.cap.patterns.mixed.interprocedural2;

import main.java.org.cambench.cap.patterns.pure.FieldSensitivity;

public class Inter2Field {
    public void main(String[] args) {
        Class1 classObject = new Class1();
        classObject.value1 = "secret value";
        classObject.value2 = "non secret value";

        System.out.println(classObject.value2);
        method(classObject.value1);
    }

    public static void method(String str){
        System.out.println(str);
    }
    public class Class1 {
        String value1;
        String value2;
    }
}

