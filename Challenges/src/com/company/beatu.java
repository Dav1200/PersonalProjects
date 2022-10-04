package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class beatu {
    public static void main(String[] args) {
        int a = 13, b = 45 , k = 3;
        int reversed = 0;

        int fi =0;

        int count = 0;
        List<Float> rever = new ArrayList<>();

        int run = Math.abs(a-b);

        for(int i = 0; i <= run ;i++){
            int numDigits = String.valueOf(a+i).length();

            int temp = a+i;
            //System.out.println(temp);
            while(temp != 0) {

                // get last digit from num
                int digit = temp % 10;
                reversed = reversed * 10 + digit;

                // remove the last digit from num
               temp /= 10;
            }
            rever.add(Math.abs((float) ((a+i) - reversed)));
            rever.set(i, Math.abs(rever.get(i)/k));
            reversed = 0;;

        }

        for(int i = 0; i<= run;i++){
            if(rever.get(i) %1 == 0){
               System.out.println(rever.get(i));
                count++;
            }
        }



       System.out.println(count);
    }

}
