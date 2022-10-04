package com.company;

public class Valley {
    public static void main(String[] args) {
        String path = "DDUDUDDUDDUDDUUUUDUDDDUUDDUUDDDUUDDUUUUUUDUDDDDUDDUUDUUDUDUUUDUUUUUDDUDDDDUDDUDDDDUUUUDUUDUUDUUDUDDD";
        int steps = path.length();
        int point =0;
        int valley = 0;
        boolean inval = false;

        for(int i = 0 ; i< steps; i++){
            if(path.charAt(i) == 'D'){
                point --;
            }
            if(path.charAt(i) == 'U'){
                point ++;
            }
            if(!inval ){
            if(point == -1){
                valley++;
                inval = true;
            }
            }
            if(point == 0){
                inval = false;
            }


        }
        System.out.println(valley);
    }
}
