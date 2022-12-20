package main.java.org.cambench.cap.patterns.mixed;

public class FieldPathSensitivity {
    public void main(String[] args) {
        Class1 classObject = new Class1();
        classObject.string1 = "secret value";
        classObject.string2 = "value";
        String output;

        int condition = 1;
        if(condition > 0) {
            output = "The value is: " + classObject.string2;
        } else {
            output = "The value is: " + classObject.string1;
        }

        System.out.println(output);
    }

    public static class Class1 {
        String string1;
        String string2;
    }
}
