package notes.lec5;

public class RevArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        reverse(arr);
        System.out.print(java.util.Arrays.toString(arr));
        

    }
    static int[] reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
