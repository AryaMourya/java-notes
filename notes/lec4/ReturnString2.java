package notes.lec4;

import java.util.Scanner;

public class ReturnString2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name1 = in.nextLine();
        String personalised = myGreet(name1);
        System.out.println(personalised);
    }  
    static String myGreet(String name) {
        String greet = "Hello, " + name + "!";
        return greet;
    } 
}
