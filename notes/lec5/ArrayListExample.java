package notes.lec5;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(67);
        list.add(45);
        list.add(23);
        list.add(89);
        list.add(12);
        list.add(34);

        System.out.println(list);
    }
}

