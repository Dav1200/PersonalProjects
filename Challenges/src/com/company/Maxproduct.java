package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Maxproduct {

    public static int max(ArrayList<Integer>list){
        int max = 0;
        for(int i = 0; i<list.size();i++){
            for(int j = 0 ; j<list.size();j++){
                int temp = list.get(i) * list.get(j);
                if(temp > max){
                    max = temp;
                }

            }
        }
return max;
    }

    public static void main(String[] args) {

        ArrayList<Integer> List = new ArrayList<>();
        Collections.addAll(List, 199, 299, 33, 4,5,6,7,8,9);
        System.out.println(max(List));

    }
}
