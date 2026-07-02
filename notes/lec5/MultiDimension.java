package notes.lec5;

import java.util.Scanner;

public class MultiDimension {
    /**
     * @param args
     */
    public static void main(String[] args){  
        /*
         1 2 3
         4 5 6
         7 8 9
        */
       Scanner in = new Scanner(System.in);
      // int[][] arr = new int[3][];
      int [][] arr2D ={
        {1,2,3},// 0 index
        {4,5},// 1st index
        {6,7,8,9}// 2nd index
      };
      int[][] arr = new int[3][3];
      System.out.println(arr.length);// rows
      // input
      for(int row=0; row<arr.length; row++){
        // for each col in every row
        for (int col=0; col< arr[row].length; col++){
          arr[row][col] = in.nextInt();
        }
      }

      // Output
      for (int row=0;row<arr.length; row++){
        for(int col=0;col<arr[row].length; col++){
          System.out.print(arr[row][col]+" ");
        }
        System.out.println();
      }

      // better way to print 2D array
      for (int row=0;row<arr.length; row++){
        System.out.println(java.util.Arrays.toString(arr[row]));
      }
      //or
      for(int[] a: arr){
        System.out.println(java.util.Arrays.toString(a));
      }
}
}
