package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class foo {
    public static int zero(ArrayList<Integer> Numbers) {
        int n = Numbers.size();
        int i = 0;
        int target = 0;
        int counter = 0;
        while (i < n) {
            if (Numbers.get(i) == target)
                counter++;
            i++;
        }
        return counter;
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Collections.addAll(List, 2, 7, 0, 8, 0);
        System.out.println(zero(List));


    }
}