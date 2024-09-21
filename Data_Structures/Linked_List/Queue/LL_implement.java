package Data_Structures.Queue;

public class LL_implement {
    static class Node {
         int data;
          Node next;
        Node(int data){
            this.data= data;
            next = null;
    }

        static class Queue{
           static Node tail = null;
           static Node head = null;

           static boolean isEmpty(){
                return head ==null && tail ==null;
            }

            // Add or Enqueue
            public static void add(int data){
                Node newNode = new Node(data);
                if(tail ==null){
                    tail=head = newNode;
                    return;
                }
                tail.next = newNode;
                tail=newNode;
            }

            // Dequeue or Remove in order of O(1)
            public static int dequeue(){
                if(isEmpty()){
                    System.out.println("Queue is empty");
                    return -1;
                }
                int front = head.data;
                // if Single Element
                if(head == tail){
                    tail=null;
                }
                head= head.next;
                return front;

            }
            // Peek
            public static int peek(){
                if(isEmpty()){
                    System.out.println("Queue is Empty");
                    return -1;
                }
                return head.data;

            }

        }

        public static void main(String[] args) {
            Queue q = new Queue();
            q.add(3);
            q.add(8);
            q.add(7);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.dequeue();
            }


        }
    }



}
