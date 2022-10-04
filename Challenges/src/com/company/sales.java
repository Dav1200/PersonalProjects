package com.company;

import java.util.*;

public class sales {
    public static void main(String[] args) {

        int count = 0;
        List<Integer> arr = new ArrayList<>();


        Collections.addAll(arr, 1,2,3,4);
        Collections.sort(arr);

        long max=0;
        long  minsum = 0;
        long maxsum=0;
        long min= 0;
        long lastmin =0;
        for(int a =0 ; a<arr.size();a++){
            min += arr.get(a);
        }

        for(int i = 0; i<arr.size();i++){
            //min = minsum;
            //max = maxsum;
            maxsum = 0;
            minsum=0;
            for(int j = 0; j<arr.size();j++){
                if(i == j) {
                    minsum -= arr.get(i);
                    maxsum -= arr.get(i);
                }
                minsum += arr.get(j);
                maxsum += arr.get(j);
            }
            if(max<=maxsum){
                max = maxsum;

            }
            //min = minsum;
            if(min > minsum){
                min = minsum;
            }
        }
        //System.out.println(lastmin);
        System.out.print(min+" "+max);
    }
        }


        //System.out.println(stack.peek()-1);













