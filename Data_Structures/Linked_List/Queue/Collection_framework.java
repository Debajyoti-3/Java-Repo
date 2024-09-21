package Data_Structures.Queue;

import java.util.*;

public class Collection_framework {
    public static void main(String[] args) {
        // Queue q = new Queue()
        // Queue<Integer> q= new ArrayDeque<>();
        Queue<Integer> q= new LinkedList<>();  // As Queue is an Interface not a class, so it can't create an object
                                                // that's why we use LinkedList here

        q.add(1);
        q.add(5);
        q.add(7);
        q.size()

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
