package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class inserctionsort {

    public static ArrayList<Integer>Sort(ArrayList<Integer>list){
       for(int i = 1; i<list.size();i++){ //3
           int value = list.get(i);//1
           int j =  i-1;//2

           while(j>=0 && value < list.get(j)){//j = 2
               list.set(j+1,list.get(j));// 3 = 42
               j--;
           }
           list.set(j+1,value);
           System.out.println(list);
       }
    return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer>List = new ArrayList<Integer>();
        Collections.addAll(List,4,12,42,1,6);
        System.out.println(Sort(List));

    }

}
