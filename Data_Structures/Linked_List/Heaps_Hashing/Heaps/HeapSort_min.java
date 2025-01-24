package Data_Structures.Heaps_Hashing.Heaps;
import java.util.PriorityQueue;


//  Heap Sort for Min Heap (Ascending Order)
public class HeapSort_min {
        public static void heapSort(int[] arr) {
            // Create a PriorityQueue (min-heap)
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();

            // Add all elements from the array to the heap
            for (int num : arr) {
                minHeap.add(num);
            }

            // Extract elements from the heap back to the array (sorted order)
            int index = 0;
            while (!minHeap.isEmpty()) {
                arr[index++] = minHeap.poll();
            }
        }

        public static void main(String[] args) {
            int[] arr = {15, 10, 30, 5, 25, 20};

            System.out.println("Original Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            // Perform Heap Sort
            heapSort(arr);

            System.out.println("\nSorted Array (Ascending Order):");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


