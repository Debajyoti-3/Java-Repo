package Algorithms;
import java.util.Scanner;

public class BinarySearch {

    public static int B_search(int[] arr, int target){
        int start =0;
        int end = arr.length-1;



        while(start <= end){
            int mid = start +(end-start)/2;   // instead of mid=(start+end)/2;
                                              // as it is more apt

            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
         return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=9;
        int ans=B_search(arr,target);
        System.out.println("Found at Index "+ans);
    }
}
