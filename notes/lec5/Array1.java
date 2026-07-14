package notes.lec5;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    //or 
    int[] rollNumbers2 = {101, 102, 103, 104, 105};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // actually here is being created in the memory (heap)

        int[] arr = new int[5];
        arr[0] = 10;    
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //[10, 20, 30, 40, 50]
        System.out.println(arr[0]); // 10

        //input using for loop
        for(int i =0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for(int num : arr){ //
            System.out.print(num + " ");
        }
        /* toString()Method of Arrays class is used to convert the array into string representation.
         */
        System.out.println(Arrays.toString(arr));
    }
}
