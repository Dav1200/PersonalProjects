package Lecture2;

class PriorityQ {
    static int list[];
    static int count;
    static int max;

    PriorityQ(int size){
        list = new int[size];
        max = size;
        count = 0;

    }

    public void insert(int priority) {
            if(count !=max){
            list[count] = priority;


            for(int i = count; i>0;i--){
                int temp = list[i];
                if(list[i]>list[i-1]){
                    list[i] = list[i-1];
                    list[i-1] =temp;
                }
            }
            }
        count++;
            }

        public void show(){
            for(int i =0; i<count;i++){
                System.out.print(list[i]+ " ");
            }
        }



    public static void main(String[] args) {
PriorityQ list = new PriorityQ(5);
        list.insert(11);
        list.insert(23);
        list.insert(3);
        list.insert(441);
        list.insert(45);

        list.show();
    }
}
