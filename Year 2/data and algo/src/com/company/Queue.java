package com.company;

class Queue {
    static int front;
    static int rear;
    static int cap;
    static int list[];
    static int count;

    Queue(int c) {
        //front to check peak element;
        //rear to add element to next avaiable space;
        //cap size of list;
        //count to cycle back when space is frees;
        front = 0;
        rear = 0;
        cap = c;
        count = 0;
        list = new int[cap];
    }

    public void enqueue(int data) {
        //checks count to see if queue is full.
        if (count == cap) {
            System.out.println("full");
        }

        //mod division to cycle back to first element.
        else {
            list[rear % cap] = data;
            rear++;
            count++;
        }

    }

    public void peak() {
        //first in first out, top most element
        if (rear == front) {
            System.out.println("empty");
        }
        //modular div to cycle back to beginning.
        else {
            System.out.println("peak == " + list[front % cap]);
        }
    }


    public void dequeue() {
        //if rear == front then queue doesnt contain any elements
        if (rear == front) {
            System.out.println("empty");
        }

        //circular area loop
        //count is decreased -- > spot for extra element
        else {
            list[front % cap] = 0;
            count--;
            front++;

        }
    }

    void queueDisplay() {
        int i;
        //Check if list is empty
        if (front == rear) {
            System.out.print("\nQueue is Empty\n");

        }

        // traverse front to rear to print all elements
        for (i = front; i < rear; i++) {
            System.out.print(list[i % cap]+ ", ");
        }

    }

    public static void main(String[] args) {
        //Queue Created
        Queue a = new Queue(4);

        //Operations on queue
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(1);
        a.enqueue(2);
        a.dequeue();
        a.enqueue(1);
        a.dequeue();
        a.enqueue(2);
        a.dequeue();
        a.peak();
        a.queueDisplay();

    }

}
