package main.java.org.cambench.cap.patterns.mixed.interprocedural2;

public class Inter2Path {
    public static void main(String[] args) {
        int condition = 1;

        if(condition > 0){
            method("non secret value");
        } else {
            method("secret value");
        }
    }

    public static void method(String str){
        System.out.println(str);
    }
}
