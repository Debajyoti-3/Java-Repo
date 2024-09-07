package Algorithms;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
  int[] arr={5,4,3,2,1};
   sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums,int low, int high){
        if(low>=high){
            return;  // Base Case
        }
        int s=low;
        int e= high;
        int mid= s+(e-s)/2;   // considering Pivot as Middle will do Code Better
        int pivot = nums[mid];            /* Pivot:- left elements of the pivot must
                                          be lesser and right elements of the pivot must be*/
        while(s<=e){                      /*greater than pivot */
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[e];
                nums[e]=nums[s];
                nums[s]=temp;
                s++;
                e--;
            }
        }
        sort(nums,low,e);
        sort(nums,s,high);
    }
}

