package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class binary {

    /*
    Binary search is a divide and conquer algorithm. the middle index is found and if the element your searching for is  laocted in the middle
    the algorithm should return the middle. otherwise the algorithm should compare the middle index's value to
    the target, if the target is greater than the middle, the lower part of the array should be removed as its no longer needed, this should be
    applied to both lower and higher quartile. This process will repeat until until there is one value left(the target) which is the middle value therefore
    that will be the value ur searching for.

    */

    public static int find(ArrayList<Integer> list, int target, int first, int last) {
        int middle = first + (last - first) / 2;
        int index = 0;
        if (list.get(middle) == target) {
            index = middle;
        }
        if (list.get(middle) < target) {
            return find(list, target, middle+1, last);
        }
        if (list.get(middle) > target) {
            return find(list, target, 0, middle);
        }

        return index;
    }


    public static void main(String[] args) {
        ArrayList<Integer> run = new ArrayList<>();
        Collections.addAll(run, 11, 22, 33, 44, 55, 66, 77, 88, 99, 100);
        System.out.println(find(run, 100, 0, run.size() - 1));


    }
}
