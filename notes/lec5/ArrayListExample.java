package notes.lec5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    /**
     * @param args
     */
    public static void main(String[] args){
        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(67);
        list.add(45);
        list.add(23);
        list.add(89);
        list.add(12);
        list.add(34);
        list.add(56);
        list.add(78);
        list.add(90);
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);

        System.out.println(list.contains(45));

        System.out.println(list.set(0, 1000));

        System.out.println(list.get(0));

        System.out.println(list.remove(0));

        System.out.println(list.contains(1000));

        System.out.println(list);

        //input
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < list.size(); i++){
            list.add(in.nextInt());
        }
    }
}

