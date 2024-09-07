package Recursion;

public class Checksorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,8,9};
        System.out.println(arraysorted(arr,0));
    }
    public static boolean arraysorted(int[] arr, int index){  // Boolean return type

        if(index == arr.length-1){  // Base Case
            return true;
        }
        return arr[index]<arr[index+1] && arraysorted(arr,index+1);

    }
}
