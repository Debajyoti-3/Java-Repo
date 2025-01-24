package Data_Structures.Heaps_Hashing.Heaps;
import java.util.PriorityQueue;

public class MinHeap_CollectionFramework {
    public static void main(String[] args) {
        // Create a PriorityQueue (Min-Heap by default)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(15);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(5);

        // Display the elements in the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Retrieve and remove elements based on priority (smallest first)
        while (!priorityQueue.isEmpty()) {
            System.out.println("Processing: " + priorityQueue.poll());
        }
    }
}
