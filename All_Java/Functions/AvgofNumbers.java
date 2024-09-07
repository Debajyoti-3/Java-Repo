package Functions;

import java.util.Scanner;

public class AvgofNumbers {
    public static float Average(int x, int y, int z){
        float Avg = (float)(x+y+z)/3;
        return Avg;
    }
  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first no :");
      int a = sc.nextInt();
      System.out.println("Enter 2nd no :");
      int b = sc.nextInt();
      System.out.println("Enter 3rd no :");
      int c = sc.nextInt();
      float A = Average(a,b,c);
      System.out.println("The avg is :"+A);
  }

}
