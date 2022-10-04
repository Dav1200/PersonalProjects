package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class inta {

    public static int test(ArrayList<Integer>list, int k){
       int i = 0;
       int sum = 0;
       while(i < list.size()) {
           if (list.get(i) > k && list.get(i) % 2 == 0) {
               sum += list.get(i);
               i++;
           }
            else
            i++;
       }
       return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Collections.addAll(List, 1,2,3,4,5,6,7,8);
        int k = 2;
        System.out.println(test(List,k));

    }
}
