package notes.lec5;

public class Array1 {
    //syntax
    //datatype[] arrayName = new datatype[size];    
    //store 5 roll numbers
    int[] rollNumbers = new int[5];
    //or 
    int[] rollNumbers2 = {101, 102, 103, 104, 105};

    public static void main(String[] args) {
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
    }
}
