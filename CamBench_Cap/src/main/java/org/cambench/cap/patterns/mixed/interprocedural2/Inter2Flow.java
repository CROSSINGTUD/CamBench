package main.java.org.cambench.cap.patterns.mixed.interprocedural2;

public class Inter2Flow {
    public static void main(String[] args) {
        String value = "non secret value";
        method(value);
        value = "secret value";
    }

    public static void method(String str){
        System.out.println(str);
    }
}