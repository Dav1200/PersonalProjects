package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 5, 6);
        int t = 6;

        Map<Integer, Integer> a = new HashMap<>();


        for (int i = 0; i < list.size(); i++) {
            int c = t - list.get(i);
            a.put(list.get(i), i);
            if (a.containsKey(c)) {
                if (a.get(c) != i) {
                    System.out.println(a.get(c) + "," + i);
                }
            }


        }

    }
}


