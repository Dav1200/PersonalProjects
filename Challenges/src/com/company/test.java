package com.company;

import java.util.*;

public class test {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr, 1, 4, 4, 4, 5, 3, 1, 1);
        Map<Integer, Integer> dav = new HashMap<>();

        int val = arr.size();
        int temp = 0;

        for (int i = 0; i < arr.size(); i++) {
            dav.put(arr.get(i), 0);
        }
        for (int i = 0; i < arr.size(); i++) {
            if (dav.containsKey(arr.get(i))) {
                dav.put(arr.get(i), dav.get(arr.get(i)) + 1);
            }
        }
        System.out.println(dav);
        temp = ((Collections.max(dav.values())));
        for (Map.Entry<Integer, Integer> entry :dav.entrySet()) {
            if (entry.getValue() == temp) {
                if (entry.getKey() < val) {
                    val = entry.getKey();
                }

            }
        }


    }

}
