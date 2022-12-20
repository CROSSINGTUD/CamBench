package main.java.org.cambench.cap.patterns.mixed.interprocedural2;

public class Inter2Context {
    public void main(String[] args){
        String value1 = Identity("secret value");
        String value2 = Identity("non secret value");

        method(value1);
    }

    public static String Identity(String s){
        return s;
    }

    public static void method(String str){
        System.out.println(str);
    }
}
