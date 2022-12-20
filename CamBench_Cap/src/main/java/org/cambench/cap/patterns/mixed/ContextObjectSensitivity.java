package main.java.org.cambench.cap.patterns.mixed;

public class ContextObjectSensitivity {

    public static void main(String[] args) {
        DataObject dataObject1 = getDataObject("secret value");
        DataObject dataObject2 = getDataObject("non secret value");

        System.out.println(dataObject2.internalData);
    }

    public static DataObject getDataObject(String value){
        DataObject dataObject = new DataObject();
        dataObject.internalData = value;
        return dataObject;
    }

    private static class DataObject {
        public String internalData;
    }
}