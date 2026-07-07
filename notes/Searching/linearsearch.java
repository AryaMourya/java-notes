public class linearsearch {
    public static void main(String [] args){

    }
    // search in the array : rerurn the index if the item found
    // otherwise return -1 if item not found
   static int LinearSearch(int[] arr, int target){
            if(arr.length == target){
               return -1;
            }
        // run a for loop
        for(int index = 0; index < arr.length; index++){
            // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }

}
