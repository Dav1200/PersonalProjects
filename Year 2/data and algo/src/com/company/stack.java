package com.company;

import java.util.ArrayList;
import java.util.List;

class stack {


    static void push(List<Integer> stack, int n){
        stack.add(n);
    }
    static void pop(List<Integer> stack){
        System.out.println(stack.remove(stack.size()-1));
    }
    public static void peek(List<Integer> stack){
        System.out.println(stack.get(stack.size()-1));
    }
    public static Boolean isEmpty(int n){
        if(n == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        List<Integer> stack = new ArrayList<>();
        stack.add(2);
        System.out.println(stack);


    }}