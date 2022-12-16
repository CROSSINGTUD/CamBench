package main.java.org.cambench.cap.patterns.pure;

public class PathSensitivity {
    public static void main(String[] args) {
        int condition = 1;

        if(condition > 0){
            System.out.println("secret value");
        } else {
            System.out.println("non secret value");
        }
    }
}