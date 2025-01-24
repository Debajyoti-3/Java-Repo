package Data_Structures.Heaps_Hashing.Heaps;
import java.util.Collections;
import java.util.PriorityQueue;

//To create a max-heap priority queue, use a custom comparator with PriorityQueue or use Collections.reverseOrder().

public class MaxHeap_CollectionFramework {
    public static void main(String[] args) {
        // Create a PriorityQueue with a Max-Heap configuration
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements to the PriorityQueue
        priorityQueue.add(15);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(5);

        // Display the elements in the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Retrieve and remove elements based on priority (largest first)
        while (!priorityQueue.isEmpty()) {
            System.out.println("Processing: " + priorityQueue.poll());
        }
    }
}
