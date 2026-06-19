package notes.lec2;

import java.util.Scanner;

public class QuestionNo1 {

// Question: Write a program to find the maximum of three numbers.
// Method 1

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
         
        int max = a;
        if(b > max){
            max = b;
        }
        if(c> max){
             max = c;
        }
        System.out.println("The maximum value is: " + max);

        // Method 2
        
        if(a>b && a>c){
            max = a;
        }
        else if(b>c){
            max = b;
        }
        else{
            max = c;
        }
        System.out.println("The maximum value is: " + max);

        // Method 3

        int m = Math.max(c, Math.max(a, b));
        System.out.println("The maximum value is: " + m);
    }
    
}
