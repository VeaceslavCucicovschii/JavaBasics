import LambdaExpressions.MyInterface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        try(FileInputStream file = new FileInputStream("someFile.txt");
//            FileOutputStream fileOut = new FileOutputStream("anotherFile.txt");) {
//            int i;
//            while ((i = file.read()) != -1) {
//                fileOut.write(i);
//            }
//
//            System.out.println("file copied successfully");
//        }
//        catch (IOException e) {
//            System.out.println("Error writing file.");
//            e.printStackTrace();
//        }
//
//        String text = "\nAppended text!";
//        try (FileOutputStream output = new FileOutputStream("anotherFile.txt", true)) {
//            output.write(text.getBytes());
//
//            System.out.println("Successfully appended to file.");
//        }
//        catch (IOException e) {
//            System.out.println("Error writing file.");
//            e.printStackTrace();
//        }

//        String name = "John";
//        char symbol = '!';
//
//        MyInterface myInterface = (x, y) -> {
//            System.out.println("Hello World!");
//            System.out.println("It is a nice day! " + x + y);
//        };
//
//        MyInterface myInterface1 = (x, y) -> {
//            System.out.println("Hello " + x + y);
//        };
//
//        myInterface1.message(name, symbol);

//        Set<String> names =  new HashSet<>();
//        names.add("John");
//        names.add("Sam");
//        names.add("Skyler");
//        names.add("Daniel");
////        names.add("John");
//
////        names.forEach(System.out::println);
//
//        Iterator<String> namesIterator = names.iterator();
//        while (namesIterator.hasNext()) {
//            System.out.println(namesIterator.next());
//        }
//
////        List<Integer> numberList = new ArrayList<>();
////        numberList.add(1);
////        numberList.add(3);
////        numberList.add(2);
////        numberList.add(2);
////        numberList.add(1);
//
//        int[] numberList = {0, 0, 1, 1, 2, 3};
//
//        Set<Integer> numberSet = new HashSet<>();
////        numberSet.addAll(numberList);
//
//        for(int index : numberList)
//            numberSet.add(index);
//
//        System.out.println(numberSet);

        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("John", 7826);
        empIds.put("Carl", 2125);
        empIds.put("Jane", 2786);

        System.out.println(empIds);
        System.out.println(empIds.get("John"));
        System.out.println(empIds.containsKey("Carl"));
        System.out.println(empIds.containsValue(2786));

        empIds.put("John", 6722);
        System.out.println(empIds);

        empIds.replace("Kramer", 6722);
        System.out.println(empIds);

        empIds.putIfAbsent("John", 222);
        System.out.println(empIds);

        empIds.remove("John");
        System.out.println(empIds);
    }
}