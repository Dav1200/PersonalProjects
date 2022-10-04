package com.company;
/*
i ← 0
invariant: 0 ≤ i ≤ n and x is not in a[0] ... a[i-1]
WHILE i < n AND a[i] ≠ x
        i ← i+1
RETURN i
 */
import java.util.ArrayList;
import java.util.Collections;

public class SequentialSearchSimple {
    public static int search(ArrayList<Integer> list){
        int i = 0;
        int n = list.size();
        int x  = 9;
        while(i <n && list.get(i) != x){
            i++;}
        return i;
    }


    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        Collections.addAll(List, 1, 2, 3, 4,5,6,7,8,9);
        System.out.println(search(List) + " " + "<---index position");

    }
}
