package notes.lec2;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        /*
           syntax of for loop in Java


           for(initialization; condition; increment/decrement) {
               // code to be executed
           }
        */
       // Q: Print numbers from 1 to 5
         for(int num = 1; num <= 5; num += 2){
            System.out.println(num);         
         }
        
      // Q: Print numbers from 1 to n WITH HELLO WORLD
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int num = 1; num<= n ; num++){
          System.out.print(num +" ");
          System.out.println("Hello World");
      }

    
     // WHILE LOOP
     /*
        syntax of while loop in Java

        while(condition) {
            // code to be executed
        }
     */

        // Q: Print numbers from 1 to 5
        int num = 1;
        while(num <= 5){
            System.out.print(num + " ");
            num++;
        }

        // Do while loop
        /*
            syntax of do while loop in Java

            do {
                // code to be executed
            } while(condition);
        */
}
}