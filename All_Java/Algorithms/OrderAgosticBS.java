package Algorithms;

public class OrderAgosticBS {

    static int orderagnosticBS(int[] arr,int target){

        int start =0;
            int end = arr.length-1;
            boolean isAgs=arr[start]<arr[end];


            while(start <= end){
                int mid = start +(end-start)/2;   // instead of mid=(start+end)/2;
                                                 // as it is more apt
            if(target==arr[mid]) {
                return mid;
            }

             if(isAgs) {                //checking whether array is in ascending or descending order
                 if (arr[mid] < target) {
                     start = mid + 1;
                 } else if (arr[mid] > target) {
                     end = mid - 1;
                 }
             }
             else{
                 if(arr[mid]<target){
                     end=mid-1;
                 }
                 else if(arr[mid]>target){
                    start=mid+1;
                 }

            }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] arr={9,8,7,6,5,4,3};
            int target=3;
            int ans=orderagnosticBS(arr,target);
            System.out.println("Found at Index "+ans);
        }
    }


