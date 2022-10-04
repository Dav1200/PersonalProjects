package com.company;

public class chocolatefeast {
    public static void main(String[] args) {
        int n = 6;
        int c = 2;
        int  m = 2;
        int wrappers = (n/c);
        int total = wrappers;
        while(wrappers>=m){
            total+= wrappers/m;
            wrappers = wrappers/m;
            System.out.println(wrappers);
        }

    }
    }

