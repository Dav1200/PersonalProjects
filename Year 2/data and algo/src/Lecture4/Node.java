package Lecture4;

import java.util.Iterator;

class Node {
    int data;
    Node next;

    Node(int i, Node n) {
        data = i;
        next = n;
    }

    Node(int i) {
        this(i, null);

    }

    static class CircularLL {
        private Node tail = null;



        public boolean isEmpty() {
            return tail == null;
        }

        public void addHead(int ele) {
            if (isEmpty()) {
                tail = new Node(ele);
                tail.next = tail;
            }
            else {
                tail.next = new Node(ele, tail.next);
            }
        }

        public void addTail(int ele){
            addHead(ele);
            tail = tail.next;
        }


        public void print() {
            Node p = tail;
            do {
                p = p.next;
                System.out.println(p.data);
            } while (p != tail);
        }


    }



    public static void main(String[] args) {
        CircularLL cLL = new CircularLL();
        cLL.addTail(1);
        cLL.addTail(2);
        cLL.addTail(3);
        cLL.addHead(0);

        cLL.print();


    }

}
