package main.java.org.cambench.cap.patterns.pure;

public class Interprocedural3 {
    public static void main(String[] args) {
        String value = "secret value";
        method1(value);
    }

    public static void method1(String str1){
        String value2 = str1;
        method2(value2);
    }

    public static void method2(String str2){
        System.out.println(str2);
    }
}
