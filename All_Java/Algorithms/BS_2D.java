package Algorithms;

import java.util.Arrays;

public class BS_2D {
    public static void main(String[] args) {  // When the Matrix is Sorted in Row and column Manner
       int[][] matrix={
               {1,2,3,4},
               {5,6,7,8},
               {9,10,11,12}
       };
        System.out.println(Arrays.toString(search(matrix,40)));
    }
    public static int[] search(int[][] matrix, int target){
        int r = 0;
        int c= matrix.length-1;


        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]>target){
                c--;
            }
            else {
                r++;
            }
        }
        return new int[]{-1,-1};  // {-1,-1} means Element is not present in the Matrix
    }
}
