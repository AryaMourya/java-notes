package notes.lec2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press x or x

        while (true){
            // take the opreator as input 
            char op = in.next().trim().charAt(0);
            if (op =='+'|| op=='-'|| op =='*' || op =='/' || op == '%'){
                // input two numbers
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op =='+'){
                    System.out.println("Sum: " + (num1 + num2));
                }
                if (op =='-'){
                    System.out.println("Difference: " + (num1 - num2));
                }
                if (op =='*'){
                    System.out.println("Product: " + (num1 * num2));
                }
                if (op =='/'){
                    if (num2 != 0){
                        System.out.println("Quotient: " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                }                if (op =='%'){
                    if (num2 != 0){
                        System.out.println("Remainder: " + (num1 % num2));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                }
            } else if (op == 'x' || op == 'X'){
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
        }
    }
    
}
