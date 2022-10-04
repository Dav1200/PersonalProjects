package com.company;

import org.w3c.dom.Node;

import java.util.Collections;


//create head
class linked {
    Node head;

    //Create Node class
    static class Node {
        int data;
        Node Pointer;


        Node(int d) {
            this.data = d;
            Pointer = null;
        }
    }

    //Print array
    public void print() {
        Node tempn = head;
        while (head != null) {
            System.out.println(head.data);
            head = head.Pointer;
        }
        head = tempn;
        if (head == null) {
            System.out.println("End");
        }
    }

    //Push infront of linked list
    public void push(int ndata) {

        Node newnode = new Node(ndata);
        newnode.Pointer = head;
        head = newnode;

    }

    //returns the length of linked list
    public int size() {
        int temp = 0;
        Node tempn = head;
        while (head != null) {
            temp++;
            head = head.Pointer;
        }
        head = tempn;
        return temp;
    }

    public void middle(int ndata, int middle) {
        Node tempn = head.Pointer;
        Node newnode = new Node(ndata);
        head.Pointer = newnode;
        newnode.Pointer = tempn;

    }

    //adds node at end
    public void end(int ndata) {
        Node n = new Node(ndata);
        Node tempn = head;
        while (head != null) {
            if (head.Pointer == null) {
                head.Pointer = n;
                break;
            }
            head = head.Pointer;
        }
        head = tempn;
    }

    //delete first node
    public void delfirst() {
        head = head.Pointer;
    }

    //delete end Node
    public void delend() {
        Node tempn = head;
        while (head != null) {
            if (head.Pointer.Pointer == null) {
                head.Pointer = null;
                break;
            }
            head = head.Pointer;
        }

        head = tempn;
    }

    //delete middle node
    public void midel(int a) {
        int temp = 0;
        Node tempn = head;
        while (head != null) {
            temp++;
            if (temp == a) {
                head.Pointer = head.Pointer.Pointer;
            }

            head = head.Pointer;


        }

        head = tempn;
    }

    //reverse using a temp linked list
    public void reverse(linked first) {
        linked newl = new linked();

        while (first.head != null) {
            newl.push(first.head.data);
            first.head = first.head.Pointer;
        }

        newl.print();
    }

    //reverse using temp variables better memory space
    public void reverse2() {
        Node pre = null;
        Node nxt = head.Pointer;

        while (true) {
            head.Pointer = pre;
            pre = head;
            head = nxt;
            nxt = head.Pointer;

            if (head.Pointer == null) {
                head.Pointer = pre;
                break;
            }
        }

    }


    public static void main(String[] args) {
        linked first = new linked();
        first.head = new Node(1);
        Node second = new Node(2);
        first.head.Pointer = second; // link the pointers;


        first.push(12);
        first.middle(0, first.size() / 2);
        first.end(66);
        // first.delfirst();
        //first.delend();

        //first.midel(first.size()/2)
        first.reverse2();
        first.print();

        //first.reverse(first);
    }


}
