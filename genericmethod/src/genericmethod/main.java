package genericmethod;


import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        genericmethod example = new genericmethod();
        
        
        example.display("Hello", 123);  
        example.display(45.67, "World"); 

        // Using the getList method
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        example.getList(stringList);

        
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        example.getNumber(intList);

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        example.getNumber(doubleList);

        // Using the getInteger method
        ArrayList<Number> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2.2);
        numberList.add(3);
        example.getInteger(numberList);

        ArrayList<Object> objectList = new ArrayList<>();
        objectList.add("String");
        objectList.add(4);
        objectList.add(5.5);
        example.getInteger(objectList);
    }
    ArrayList<Integer> intList = new ArrayList<>();
   
}

