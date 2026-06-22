package notes.lec4;

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        sum();
}
 static void sum() {
     int sum,num1,num2;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number");
    num1 = in.nextInt();
    System.out.print("ENTER Number 2:");
    num2 = in.nextInt();
    sum = num1 + num2;
    System.out.println("the sum =" + sum);
 }
}