package main.java.org.cambench.cap.patterns.mixed;

public class FlowPathSensitivity {
    public static void main(String[] args) {
        String value = "secret value";

        int condition = 1;
        if(condition > 0){
            value = "non secret value";
        } else {
            value = "secret value";
        }

        System.out.print(value);
    }
}
