package Recursion;

import java.util.Scanner;

public class ProductofDigits {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number:");
            int a = sc.nextInt();
            int ans= sum(a);
            System.out.println("It's Product of digits is :"+ans);
        }
        public static int sum(int a){
            if ((a%10) == a) {

                return a;
            }
            int r= a %10;

            return r * sum(a/10);
        }
    }


