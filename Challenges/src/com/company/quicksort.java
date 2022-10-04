package com.company;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class quicksort {
    public static int partition(ArrayList<Integer> list, int l, int h) {
        int pivot = list.get(l);
        //Random rand = new Random();
        //int randomNum = list.get(l) + rand.nextInt((list.get(h) - list.get(l)) + 1);
        int pi = list.indexOf(pivot);

        Collections.swap(list, pi, list.size() - 1);

        int i = l, j = h, middle = 0;
        boolean a = false, b = false;
        while (i < j) {
            if (list.get(i) > pivot) {
                a = true;
            } else {
                i++;
                a = false;
            }
            if (list.get(j) < pivot) {
                b = true;
            } else {
                j--;
                b = false;
            }
            if (a && b) {
                Collections.swap(list, i, j);
                i++;
                j--;
            }


        }

            Collections.swap(list, i, list.size() - 1);
            middle = i;
        return middle;

    }
    public static ArrayList<Integer> quicksort(int l, ArrayList<Integer> list, int h) {

        if (l<h) {
            int middlee = partition(list,l,h);
            quicksort(l,list,middlee);
            quicksort(middlee+1,list,list.size()-1);

        }

        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 9,8,7,6,5,4,3,2,1);
        //System.out.println();
        //int middle = partition(list, 0, list.size() - 2);
        System.out.println(quicksort(0,list,list.size()-1));

       // partition(list,0, list.size()-1);


    }
}
