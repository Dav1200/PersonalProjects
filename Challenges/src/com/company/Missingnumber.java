package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Missingnumber {

    public static int missing(ArrayList<Integer> list) {

        int miss = 0;

        for (int i = 0; i < list.size(); i++) miss += list.get(i);
        return miss;
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Collections.addAll(List, 1, 2, 3, 4, 5, 6, 7, 8,10);

        int size = List.size() + 1;
        int max = size * (1 + size) / 2;
        System.out.println(max - missing(List));



    }
}
