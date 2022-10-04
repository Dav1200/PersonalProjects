package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class duplicate {
    public static int dup(ArrayList<String> list) {
        int i = list.size() - 1;
        while (i >= 1) {
            if (list.get(i).length() != list.get(i - 1).length()) {
                break;
            }
            if (list.get(i).length() == list.get(i).length()) {
                i--;
            }
        }
        return i;
    }


    //this program will check if the string lengths are the same for entire array, it will output 0 if same else other wise
    public static void main(String[] args) {
        ArrayList<String> Dav = new ArrayList<>();
        Collections.addAll(Dav, "hello", "world", "hello","as");
       // System.out.println(Dav.size());
        System.out.println(dup(Dav));

       // double a  =(double) 67/5;
        //int b = (int) Math.ceil(a)*5;
       // System.out.println(b);

        //System.out.println(a);

       //System.out.println(5*(Math.ceil(Math.abs(73/5))));
    }
}
