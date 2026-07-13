public class EvenDigit {
    public static void main(String[] args){

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check if the number of digits in a number is even
    private static boolean even(int num){
        int digitCount = 0;
        while (num != 0){
            digitCount++;
            num /= 10;
        }
        return digitCount % 2 == 0;
    }
}