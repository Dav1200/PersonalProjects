package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class check {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,4,2,6,1,10);
        int k = 3;
        int n = 5;


        int special = 0;
        int chapter = 1;
        int pages =0;

        for(int i = 0; i < n;i++)
        {
            for(int j = 1 ; j<=arr.get(i);j++){
                if(j == arr.get(i)){
                    pages++;
                }
                System.out.println(pages);
                if(j% k == 0 && j != arr.get(i)){
                    pages++;

                }


            }

        }
        System.out.println();
}}
