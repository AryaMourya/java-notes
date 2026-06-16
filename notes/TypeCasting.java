package notes;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        // Type Casting
        int num2 = (int)(67.56f);
        System.out.println(num2);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);

        byte c = 40;
        byte d = 50;    
        int e = 100;
        int f = c * d / e; // 40 * 50 / 100 = 20
        System.out.println(f);

        byte k = 42;
        char l = 'a';
        short s = 1024;     
        int i = 50000;
        float m = 5.67f;
        double n = 0.1234;
        double result = (m * k) + (i / l) - (n * s); // 5.67*42 + 50000/97 - 0.1234*1024
        System.out.println((m * k) + " " + (i / l) + " " + (n * s));
        System.out.println(result);
    }
}
