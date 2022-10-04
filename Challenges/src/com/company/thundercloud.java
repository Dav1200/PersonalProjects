package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class thundercloud {
    public static void main(String[] args) {
        ArrayList<Integer> c = new ArrayList<Integer>();

        Collections.addAll(c, 1, 2, 3, 1, 2, 3, 3, 3); // 3,4,5,6
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < c.size(); i++) {
            if (map.containsKey(c.get(i))) {
                map.put(c.get(i), map.get(c.get(i)) + 1);
            } else
                map.put(c.get(i), 1);
        }
        int temp = ((Collections.max(map.values())));


        for (Map.Entry<Integer, Integer> currentEntry:map.entrySet()) {
            if(currentEntry.getValue() == temp){
                temp = currentEntry.getKey();
            }

        }


        System.out.println(temp);
    }

}
