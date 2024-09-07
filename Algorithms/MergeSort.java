package Algorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    int[] arr={7,5,8,3,19,6,32,1,-4,-7,-110};
    arr=mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;  // Base Case
        }
        int mid=arr.length/2;
        int[] left= mergesort(Arrays.copyOfRange(arr,0, mid)); // copy a range of Array with given Beginning and End
        int [] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[]first,int[] second){
        int i=0; // left side pointer
        int j=0;  // Right side pointer
        int k=0; //Pointer to store Elements in Mix array
        int[] mix = new int[first.length+ second.length];
        while(i< first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else if(second[j]<first[i]) {
             mix[k]=second[j];
             j++;
            }
            k++;
        }
        // it may possible that there left some elements in one side left
        while(i< first.length){
            mix[k]=first[i];
            k++;
            i++;
        }
        while (j< second.length){
            mix[k]=second[j];
            k++;
            j++;
        }
        return mix;
    }
}
