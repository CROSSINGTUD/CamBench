package main.java.org.cambench.cap.patterns.pure;

public class ObjectSensitivity {
    public void main(String[] args) {
        DataObject dataObject1 = new DataObject();
        DataObject dataObject2 = new DataObject();
        dataObject1.value = "secret value";
        dataObject2.value = "non secret value";

        System.out.println(dataObject1.value);
    }

    private class DataObject{
        public String value;
    }
}
