package main.java.org.cambench.cap.patterns.mixed;

public class ContextPathSensitivity {
    public static void main(String[] args){
        String value1 = Identity("value");
        String value2 = Identity("secret value");
        String output;

        int condition = 1;
        if(condition > 1) {
            output = "The value is: " + value2;
        } else {
            output = "The value is: " + value1;
        }

        System.out.println(output);
    }

    public static String Identity(String s){
        return s;
    }
}
