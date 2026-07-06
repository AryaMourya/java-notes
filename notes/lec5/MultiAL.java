package notes.lec5;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(3);

        // add empty arraylists
        for(int i = 0; i< 3 ;i++ ){
            list.add(new ArrayList<>());
        }

        Scanner in = new Scanner(System.in);
        // add elements
        for(int i = 0; i< 3 ;i++ ){
            for (int j = 0; j < 3; j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
    }
}
