package main.java.org.cambench.cap.patterns.mixed;

public class ObjectPathSensitivity {
    public void main(String[] args) {
        DataObject dataObject1 = new DataObject();
        DataObject dataObject2 = new DataObject();
        dataObject1.internalData = "secret value";
        dataObject2.internalData = "value";
        String output;

        int condition = 1;
        if(condition > 0) {
            output = "The output is: " + dataObject1.internalData;
        } else {
            output = "The output is: " + dataObject1.internalData;
        }

        System.out.println(output);
    }

    private class DataObject{
        public String internalData;
    }
}
