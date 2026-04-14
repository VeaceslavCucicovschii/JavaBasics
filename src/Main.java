import LambdaExpressions.MyInterface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
        String name = "John";
        char symbol = '!';

        MyInterface myInterface = (x, y) -> {
            System.out.println("Hello World!");
            System.out.println("It is a nice day! " + x + y);
        };

        MyInterface myInterface1 = (x, y) -> {
            System.out.println("Hello " + x + y);
        };
        
        myInterface1.message(name, symbol);
    }
}