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
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    //count number of digits in a number
    static int digits(int num){
        int count = 0;

        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }
}