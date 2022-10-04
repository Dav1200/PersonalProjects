package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Checkorder {
    public static void main(String[] args) {
        List<Integer>out = new ArrayList<>();
        int[] c = new int[8];
        c[0] = 0;
        c[1] =0;
        c[2] = 1;
        c[3] = 0;
        c[4] = 0;
        c[5] = 1;
        c[6] = 1;
        c[7] = 0;


        // 52134
        List<Integer>tp = new ArrayList<>();
        List<Integer> p = new ArrayList<>();

        int k  = 2;
        int energy = 100;

        int pos = 0;
        int count = 0;

        for(int i =0; i<c.length +k;i+=k) {
            if (i > c.length) {
                count++;
                pos = i - 1;
                pos %= k;
                i = pos;
            }
            if (count > 0) {
                if (i == 0) {
                    break;
                }
            }
            if (i < c.length) {
                tp.add(c[i]);
                // System.out.println(i);
            }
        }
        for(int i = 0 ; i<tp.size();i++){
            if(tp.get(i) == 0){
                energy--;
            }
            if(tp.get(i) ==1){
                energy-=3;}

    }
        System.out.println(tp);

    }}
//0 0 1 0 0 1 1 0