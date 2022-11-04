package main.java.org.cambench.cap.patterns.mixed;

public class FieldObjectSensitivity {
    public static void main(String[] args) {
        DataObject dataObject1 = new DataObject();
        DataObject dataObject2 = new DataObject();
        dataObject1.value1 = "secret value";
        dataObject2.value1 = "non secret value";
        dataObject1.value2 = "non secret value";
        dataObject2.value2 = "secret value";

        System.out.println(dataObject2.value2);
    }

    public static class DataObject{
        String value1;
        String value2;
    }
}