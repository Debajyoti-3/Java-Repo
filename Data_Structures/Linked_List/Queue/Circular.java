package Data_Structures.Queue;

public class Circular {

        static class Queue{
            static int rear =-1;
            static int front = -1;
            static int arr[];
            static int size;
            Queue(int n){
                arr = new int[n];
                this.size = n;
            }
            static boolean isEmpty(){

                return rear == -1;
            }
            static boolean isFull(){
                return (rear+1) % size==front;
            }
            // Add or Enqueue
            public static void add(int data){
                if(isFull()){
                    System.out.println("Queue is Full");
                    return;
                }
                if(front == -1){
                    front =0;
                }
                rear = (rear+1)%size;
                arr[rear] = data;
            }
            // Dequeue or Remove in order of O(1)
            public static int dequeue(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }
                int result = arr[front];
                // Shift all elements from index 1 till rear to the left by one
                if(front == rear){
                    front =rear =-1;
                }
                else{
                    front = (front+1)%size;
                }
                return result;
            }
            // Peek
            public static int peek(){
                if(isEmpty()){
                    System.out.println("Queue is Empty");
                    return -1;
                }
                return arr[front];

            }

        }

        public static void main(String[] args) {
            Queue q = new Queue(10);
            q.add(5);
            q.add(9);
            q.add(7);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.dequeue();
            }


        }
    }


