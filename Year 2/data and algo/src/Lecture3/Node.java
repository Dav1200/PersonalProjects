package Lecture3;

class Node {

    public int info;
    public Node next;

    public Node(int i, Node n) {
        info = i;
        next = n;
    }

    public Node(int i) {
        this(i, null);
    }

    public static class SLList {
        private Node head = null;
        private Node tail = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void addToHead(int el) {

            head = new Node(el, head);
            if (tail == null) {
                tail = head;
            }
        }

        public void addToTail(int ele) {

            if (!isEmpty()) {
                tail.next = new Node(ele);
                tail = tail.next;
            } else
                head = tail = new Node(ele);
        }

        public void delhead(){
            int ele = head.info;
            if(head == tail){
                head = tail = null;
            }
            else{
                head = head.next;
            }
        }

        public void deltail(){
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next= null;
            tail = temp;


        }
        public void test(){
            head.next = head.next.next;
            head.next = new Node(7,head.next);
            head.next.next = new Node(8);
            head.next.next = head;
            //ll.deltail();

            System.out.println(head.info);

        }
        public boolean print(){
            while (head != null) {
                System.out.println(head.info);
                head = head.next;
            }
            return false;
        }
    }


    public static void main(String[] args) {


        SLList ll = new SLList();
        ll.addToHead(1);

        ll.addToHead(2);
        ll.addToHead(3);
        ll.addToHead(4);
ll.print();
        System.out.println(ll.tail.info);

    }
}
