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

        public int deleteFromHead() {
            int el = tail.next.data;
            if (tail == tail.next)
                tail = null;
            else
                tail.next = tail.next.next;
            return el;
        }


        public void forwards() {
            for (DLLNode p = head; p != null; p = p.next)
                System.out.println(p.data);
        }

        public void backwards() {
            for (DLLNode p = tail; p != null; p = p.prev)
                System.out.println(p.data);
        }

        public int deleteTail() {
            int ele = tail.data;
            if (head == tail) {
                head = tail = null;

            } else {
                tail = tail.prev;
                tail.next = null;
            }
            return ele;
        }

        public void deleteAny(DLLNode p) {
            if (p.prev == null) {
                head = p.next;
            } else {
                p.prev.next = p.next;
            }

            if (p.next == null) {
                tail = p.prev;
            } else {
                p.next.prev = p.prev;
            }
        }

    }


    public static void main(String[] args) {
        DLList a = new DLList();
        a.addHead(4);
        a.addHead(3);
        a.addHead(2);
        a.addHead(1);
        a.backwards();
    }
}
