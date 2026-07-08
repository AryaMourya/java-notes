public class linearsearch {
    public static void main(String [] args){
        int[] arr = {23, 45, 67, 89, 12, 34};
        int target = 12;
        int ans = LinearSearch(arr, target);
        System.out.println(ans);

    }
    // search in the array : rerurn the index if the item found
    // otherwise return -1 if item not found
   static int LinearSearch(int[] arr, int target){
            if(arr.length == 0){ // here arr.length dont have any () because it is a property of the array and not a method//
               return -1; // here in this case we are checking if the array is empty or not, if it is empty then we will return -1 because there is no element in the array to search for.
            }
        // run a for loop
        for(int index = 0; index < arr.length; index++){
            // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        // if the element was not found
        return -1;
    }

}
