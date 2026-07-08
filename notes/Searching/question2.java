public class question2 {
    public static void main(String[] args){
        int [] arr = {23, 45, 67, 89, 12, 34};
        int target = 12;
        System.out.println(Search(arr, target, 0, 4));
    }
    static int Search(int arr[],int target, int start,int end){
        if(arr.length == 0){ // here arr.length dont have any () because it is a property of the array and not a method//
            return -1; // here in this case we are checking if the array is empty or not, if it is empty then we will return -1 because there is no element in the array to search for.
        }
        for(int index = start; index < end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
