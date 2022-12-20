package main.java.org.cambench.cap.patterns.mixed;

public class FlowObjectSensitivity {
    public static void main(String[] args) {
        DataObject dataObject1 = new DataObject();
        DataObject dataObject2 = new DataObject();
        dataObject1.value = "secret value";
        dataObject2.value = "non secret value";

        System.out.println(dataObject2.value);

        dataObject2.value = "secret value";
    }

    public static class DataObject{
        public String value;
    }
}