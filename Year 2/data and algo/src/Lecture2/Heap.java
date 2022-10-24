package Lecture2;

public class Heap {
    static int[] heap;
    static int count;

    Heap(int n) {
        heap = new int[n];
        count = 0;
    }

    public void add(int ele) {
        /*
        checks if heap contains more than one element, compares new element with parent element
        if true, the current position will update to parent positions will become the new element
         */
        int pos = count ;
        while (pos > 0 && ele > heap[parent(pos)]) {
            heap[pos] = heap[parent(pos)];
            pos = parent(pos);
        }
        heap[pos] = ele;
        count++;
    }
    public int extract(){
        /*
        Make the last element the parent
        call the moved method to check order
        parameters include first position and last
         */
        int max = heap[0];
        heap[0] = heap[count-1];
        count--;
        movedown(heap,0,count);
        return max;

    }

    public int[] merge(int[] a,int[] b){

        int[] n = new int[a.length+b.length];

return  n;
    }


    public void heapsort(int[] data){

    }

    public void movedown(int heap[],int first,int last){
        /*
        checks if the left most element is the last,
        from parent finds the next highest node either left or right,

        if first element is heap is larger than computed value then no change is needed
        else, keep checking the left, right node and comparing to parent to check for higher value
         */
        int larger = 0;
        while(left(first) <=last){
            if(heap[left(first)] >heap[right(first)] ){
                larger = left(first);
            }
            else{
                larger = right(first);
            }
            if(heap[first] > heap[larger]){
                break;
            }
            //Swap function;
            int temp = heap[larger];
            heap[larger] = heap[first];
            heap[first] = temp;
        }


    }

    public void show() {
        for (int i = 0; i < count; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    private int parent(int n) {
        return (n - 1) / 2;
    }

    private int left(int n) {
        return n * 2 + 1;
    }

    private int right(int n) {
        return n * 2 + 2;
    }


    public static void main(String[] args) {
        Heap heap = new Heap(6);
        heap.add(12);
        heap.add(20);
        heap.add(33);
        heap.add(102);
        heap.add(88);
        heap.add(34);
        System.out.println( heap.extract());
        System.out.println( heap.extract());

        heap.show();

    }
}
