package main.java.org.cambench.cap.patterns.mixed.interprocedural2;

import main.java.org.cambench.cap.patterns.pure.ObjectSensitivity;

public class Inter2Object {
    public void main(String[] args) {
        DataObject dataObject1 = new DataObject();
        DataObject dataObject2 = new DataObject();
        dataObject1.value = "secret value";
        dataObject2.value = "non secret value";

        method(dataObject2.value);
    }

    public static void method(String str){
        System.out.println(str);
    }

    private class DataObject{
        public String value;
    }
}