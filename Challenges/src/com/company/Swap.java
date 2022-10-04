package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Swap {

    public static ArrayList<Integer> Swap(ArrayList<Integer> Data) {

        Scanner asd = new Scanner(System.in);
        System.out.println("enter how many index you want to sawp");
        Double n = Math.floor(Data.size() / 2) - asd.nextInt();
        int counter = 1;
        double run = Math.floor(Data.size() / 2) - n;
        for (int i = 0; i < run; i++) {
            int temp = Data.get(i);
            int temp2 = Data.get(Data.size() - counter);
            Data.set(i, Data.get(Data.size() - counter));
            Data.set(Data.size() - counter, temp);
            counter++;
        }
        return Data;
    }

    public static ArrayList<Integer> PushEnd(ArrayList<Integer> Data) {
        Scanner asd = new Scanner(System.in);
        ArrayList<Integer> check = new ArrayList<>();
        System.out.println("enter how many index you want to Push to the end of array ");
        int PushAmount = asd.nextInt();
        int i = 0;

        int original = Data.size();

        while (i <= PushAmount - 1) {
            Data.add(Data.get(0));
            Data.remove(0);
            i++;
                }
        return Data;
    }

    public static void main(String[] args) {
        ArrayList<Integer> Data = new ArrayList<>();

        Collections.addAll(Data, 39, 29, 34, 58, 16, 34, 85, 77, 14);

        System.out.println(Data);
        //System.out.println(Swap(Data));
        System.out.println(PushEnd(Data));

    }


}

