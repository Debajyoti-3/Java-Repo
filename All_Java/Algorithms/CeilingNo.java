package Algorithms;

public class CeilingNo {

     // Ceiling of a Number:- lowest no in the array which is greater or equals to the Number
        public static int ceiling(int[] arr, int target){
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
            if(target<=arr[arr.length-1]) {
                return start;
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] arr={1,3,4,6};
            int target=5;
            int ans=ceiling(arr,target);
            System.out.println("Found at Index "+ans);
        }
    }


