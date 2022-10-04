package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        Collections.addAll(Numbers, 27, 14, 77, 85, 34, 16, 58, 34, 29, 39);
        int large = 0;
        int findnum = 34;
        for (int i = 0; i < Numbers.size(); i++) {
            if (Numbers.get(i) == findnum)
                index.add(i);

            if (Numbers.get(i) > large)
                large = Numbers.get(i);
        }
        if (index.size() > 0) {
            System.out.println(index.get(0));
        }
        if (index.size() == 0) {
            System.out.println(Numbers.size());
        }
        System.out.println(large);
    }
}

