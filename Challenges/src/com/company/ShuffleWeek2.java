package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleWeek2 {
    public static ArrayList<Integer> Shuffle(ArrayList<Integer> list) {

        for(int i = 0; i < list.size();i++){
            int random2 = 0 + (int)(Math.random() * ((3 - 0) + 1));
            int temp = list.get(i);
            int temp2 = list.get(random2);
            System.out.println(temp+" "+temp2);
            list.set(i,temp2);
            list.set(random2,temp);

        }
return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Collections.addAll(List, 1, 2, 3, 4,5,6,7,8,9);
        System.out.println(Shuffle(List));



    }
}
