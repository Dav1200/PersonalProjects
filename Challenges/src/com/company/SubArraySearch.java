package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class SubArraySearch {
    public static int Search(ArrayList<Character> t, ArrayList<Character> s) {
        int i = 0;
        int j = 0;
        int n = s.size();
        int a = 0;
        while (i < t.size() && j < n) {
            if (t.get(i) == s.get(j)) {
                i++;
                j++;
                if (j == n) {
                    a = i - j;
                    break;
                }
            } else {
                i = (i - j) + 1;
                j = 0;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        ArrayList<Character> t = new ArrayList<>();
        ArrayList<Character> S = new ArrayList<>();
        Collections.addAll(t, 'z', 'z', 'c', 'z', 'c', 'z', 'z');
        Collections.addAll(S, 'c', 'z', 'c');
        System.out.println(Search(t, S));


    }
}
