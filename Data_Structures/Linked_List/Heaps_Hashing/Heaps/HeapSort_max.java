package Data_Structures.Heaps_Hashing.Heaps;
import java.util.Collections;
import java.util.PriorityQueue;


// Heap sort for Max Heap (descending Order)

public class HeapSort_max {
    public static void heapSortDescending(int[] arr) {
        // Create a PriorityQueue with a Max-Heap configuration
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add all elements from the array to the heap
        for (int num : arr) {
            maxHeap.add(num);
        }

        // Extract elements from the heap back to the array (sorted order)
        int index = 0;
        while (!maxHeap.isEmpty()) {
            arr[index++] = maxHeap.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr = {15, 10, 30, 5, 25, 20};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Perform Heap Sort in Descending Order
        heapSortDescending(arr);

        System.out.println("\nSorted Array (Descending Order):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
