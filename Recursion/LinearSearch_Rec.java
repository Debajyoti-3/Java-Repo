package Recursion;

public class LinearSearch_Rec {
    public static void main(String[] args) {
        int[] arr={1,3,22,4,8,29};
        System.out.println(serach(arr,22,0));
        //System.out.println(findIndex(arr,5,0));
    }
    public static boolean serach(int[] arr,int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || serach(arr,target,index+1);
    }

   /* public static int findIndex(int[] arr,int target, int index){  // Same thing Different Process
        if(index==arr.length){
            return -1;
        }
        else if(arr[index]==target){
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }
    }*/
}
