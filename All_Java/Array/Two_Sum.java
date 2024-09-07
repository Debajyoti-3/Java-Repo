package Array;
import java.util.Scanner;
public class Two_Sum {

    public static int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length-1;i++){

            for(int j=+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }

                }
                }
        return new int[]{};
            }


            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of the array :");
        int size =sc.nextInt();
        int[] nums= new int[size];
        System.out.println("Enter the array elements :");
        for(int i=0;i<nums.length;i++) {
            nums[i] = sc.nextInt();
        }
            System.out.println("Enter the target :");
            int target= sc.nextInt();

            System.out.println(twoSum(nums,target));
        }
    }

