package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Bubblesort {

    public static ArrayList<Integer> bubble(ArrayList<Integer> list) {

        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.size() - 1; i++)
                if (list.get(i + 1) < list.get(i)) {
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 422, 2, 7, 1, 99);
        System.out.println(bubble(list));

    }
}
