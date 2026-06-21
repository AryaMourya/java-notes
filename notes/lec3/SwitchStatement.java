package notes.lec3;

import java.util.Scanner;

public class SwitchStatement {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();       

         switch (fruit) {
            case "apple" -> System.out.println("Apple is red");
            case "banana" -> System.out.println("Banana is yellow");
            case "grape" -> System.out.println("Grape is purple");
            default -> System.out.println("Unknown fruit");
        }
    }
}