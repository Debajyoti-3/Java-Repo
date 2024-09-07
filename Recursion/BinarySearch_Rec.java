package Recursion;

public class BinarySearch_Rec {
    public static void main(String[] args) {
        int[] arr= {1,2, 3, 56,57,88};
        int target = 56;
        System.out.println("The index of Target is :");
        System.out.print(search(arr, target,  0, arr.length-1));

    }
    public static int search(int[] arr, int target, int s, int e){
        int m = (s+e)/2;
        if(s>e){
            return -1;
        }
        if(arr[m]==target){
           return m;
        }
        if(arr[m]<target){
            return search(arr,target,m+1,e);
        }

            return search(arr,target,s,m-1);

    }
}
