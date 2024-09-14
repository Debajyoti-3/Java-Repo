package Data_Structures.Queue;

public class Array_implmnt {
    static class Queue{
        static int rear =-1;
        static int arr[];
        static int size;
         Queue(int n){
             arr = new int[n];
             this.size = n;
         }
         static boolean isEmpty(){
             return rear == -1;
         }
         // Add or Enqueue
        public static void add(int data){
             if(rear == size-1){
                 System.out.println("Queue is Full");
                 return;
             }
             rear++;
             arr[rear] = data;
         }
         // Dequeue or Remove
        public static int dequeue(){
             if(isEmpty()){
                 System.out.println("Queue is empty");
                 return -1;
             }
             int front = arr[0];
            // Shift all elements from index 1 till rear to the left by one
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            // Decrement rear
            rear--;
            return front;
         }
         // Peek
        public static int peek(){
             if(isEmpty()){
                 System.out.println("Queue is Empty");
                 return -1;
             }
            return arr[0];

        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.add(2);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
           q.dequeue();
        }


    }
}
