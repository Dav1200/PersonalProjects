package Lecture4;

public class DLLNode {
    int data;
    DLLNode next, prev;

    DLLNode(int i, DLLNode n, DLLNode p) {
        data = i;
        next = n;
        prev = p;
    }

    DLLNode(int ele) {
        this(ele, null, null);
    }

    public static class DLList {
        private DLLNode head = null;
        private DLLNode tail = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void addHead(int ele) {
            if (isEmpty()) {
                head = new DLLNode(ele);
                tail = head;
            } else {
                head = new DLLNode(ele, head, null);
                head.next.prev = head;

            }

        }

        public void addTail(int ele) {
            if (isEmpty()) {
                head = tail = new DLLNode(ele);

            } else {
                tail = new DLLNode(ele, null, tail);
                tail.prev.next = tail;
            }
        }
    }


    public static void main(String[] args) {
        DLList a = new DLList();
        a.addHead(2);

        a.addHead(1);
        System.out.println(a.tail.data);
        System.out.println(a.head.next.prev.data);

    }
}
