package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class candles {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,5,4,4,2,2,8);
        System.out.println(arr.get(arr.size()));
        List<Integer> ans = new ArrayList<>();
        int min  = 0;
        int x = 0;
        ans.add(arr.size()-1);
        int temp  = 1000000;
        int count = 0;
        for(int i = 0; i < arr.size();i++){
            if(arr.get(i)==0){

                continue;
            }
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(j)!= 0 && arr.get(j) < temp && arr.get(j) >=0){
                    temp = arr.get(j);
                }
                if(arr.get(j) == 0){

                    arr.remove(j);
                    j--;

                }

            }


            for(int j = 0; j < arr.size(); j++){
                x = arr.get(j) - temp;
                arr.set(j, x);

            }

            for(int j = 0; j< arr.size(); j++){
                if(arr.get(j) != 0){
                    count++;

                }
            }
            System.out.println(arr);
            ans.add(count);
            count = 0;

        }
        System.out.println(ans);
    }
}
