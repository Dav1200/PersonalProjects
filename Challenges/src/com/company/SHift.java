package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SHift {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        Collections.addAll(a,3,4,5,6); // 3,4,5,6
        int key = a.get(0);
        int k =3;
        List<Integer> tp = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<Integer>(a);
        for(int i = a.size()-k; i<a.size() ; i++){
            tp.add(a.get(i));
        }
        int def = a.size() - tp.size();

        for(int i = 0 ; i <def;i++ ){
            b.set(i+k, a.get(i));
        }

        for(int i = 0 ; i < k; i++){
            b.set(i, tp.get(i));
        }





        System.out.println(b);
}}
