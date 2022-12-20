package main.java.org.cambench.cap.patterns.pure;

public class Interprocedural2 {
    public static void main(String[] args) {
        String value = "secret value";
        method(value);
    }

    public static void method(String str){
        System.out.println(str);
    }
}