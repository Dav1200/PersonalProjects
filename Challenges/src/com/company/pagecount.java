package com.company;

public class pagecount {
    public static void main(String[] args) {
        int p = 29;
        int n = 38;
        int front = Math.floorDiv(p,2);


        int back = Math.floorDiv(n-p,2);
        if(p%2 == 1 && p!=n && n%2 ==0 ){
            back+= 1;
        }
        System.out.println(Math.min(front,back));



        System.out.println(front+ " "+ back);



    }
}
