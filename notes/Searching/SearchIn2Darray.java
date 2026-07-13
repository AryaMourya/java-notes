package notes.searching;
public class SearchIn2Darray {
    public static void main(String[] args){
        int[][] arr = {
            {23,4,1},
            {56,78,90},
            {12,34,67},
            {10, 20, 30}
        };

        int target = 34;
        int[] ans = search(arr, target);
        System.out.println(java.util.Arrays.toString(ans));
    }
    static int[] search(int arr[][], int target){
        for (int row = 0; row < arr.length;row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col]== target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}