public class question3 {
    public static void main(String[] args){
        int arr []  = {23, 45, 67, 89, 12, 34};
        System.out.println(min(arr));
    }
    static int min(int arr[]){
       int ans = arr[0];
       for (int i = 1; i< arr.length; i++){
        if (arr[i] < ans){
            ans = arr[i];
        }
       } 
       return ans;
    }
}