package com.company;

import java.util.*;

public class SUbarrayofabs {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        Collections.addAll(a, 9, 6, 13, 16, 5, 18, 4, 222, 3, 19, 4, 5, 8, 1, 13, 10, 20, 17, 15, 10, 6, 10, 13, 20, 18, 17, 7, 10, 6, 5, 16, 18, 13, 20, 19, 7, 16, 13, 20, 17, 4, 17, 8, 19, 12, 7, 17, 1, 18, 3, 16, 4, 5, 3, 15, 17, 6, 17, 14, 11, 11, 7, 11, 6, 15, 15, 12, 6, 17, 19, 8, 6, 13, 9, 10, 19, 14, 18, 7, 9, 11, 16, 11, 20, 4, 20, 10, 7, 8, 4, 2, 12, 11, 8, 12, 13, 19, 8, 8, 5);
        Collections.sort(a);
        int total = 0;
        int temp = 0;
      // System.out.println(a);
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i  = 0 ; i<a.size();i++){
            mp.put(a.get(i),0);

        }
        for(int i  = 0 ; i<a.size();i++){
            if(mp.containsKey(a.get(i))){
                mp.put(a.get(i), mp.get(a.get(i))+1);

            }

        }



        for(Map.Entry<Integer,Integer> e :mp.entrySet()){
            b.add(e.getValue());
        }
        //Collections.sort(b);
        System.out.println(mp);

        for(int i = 0 ; i < b.size()-1;i++){
            System.out.println(i);
            if(b.get(i) + b.get(i+1) > temp){
                temp = b.get(i) + b.get(i+1);

            }
        }



/*
1 = 2
2 =1
3 = 3
4 = 6
 */


    }}



