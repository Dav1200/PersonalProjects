package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public static ArrayList<Integer>Selectionsort(ArrayList<Integer>list){

     for(int i = 0; i<list.size();i++){
         int min = i;
         for(int j = i;j<list.size();j++)
             if (list.get(j) < list.get(min))
                 min = j;


         int temp1 = list.get(i);
         int temp2 = list.get(min);
         list.set(i,temp2);
         list.set(min,temp1);
         System.out.println(list);
     }
     return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer>List = new ArrayList<Integer>();
        Collections.addAll(List,19,47,37,61,83,31,41,13,59,73,17,23);
        Selectionsort(List);
        System.out.println(Selectionsort(List));

    }
}
