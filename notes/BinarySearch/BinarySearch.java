package notes.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        
    }
    // return the index
    static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            // int mid = start + end / 2; // this is also correct but it might exceed the range of int in java

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
