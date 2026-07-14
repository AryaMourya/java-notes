package notes;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your roll number: ");
            int rollno = input.nextInt();
            System.out.println("Your roll number is: " + rollno);
        }
    }
    
}
