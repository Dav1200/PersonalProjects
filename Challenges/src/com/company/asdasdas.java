package com.company;


public class asdasdas {
    public static void main(String[] args) {
        String s = "{{[[(())]]}}";
        int i = s.length()+1;
        while (s.length() !=i){
            i = s.length();
          s =  s.replace("()","");
            s = s.replace("{}","");
            s = s.replace("[]","");

        }

        if(s.length() == 0){
            System.out.println(s);
        }
        else
            System.out.println("no");


    }


}
