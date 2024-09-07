package Strings;

import java.util.Scanner;

public class InputOutput {
    public static void main(String args[]){

        /* String name = "Debajyoti Mitra";
        String home = "Kharagpur";
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();          // sc.next() is for Input a WORD
                                         //sc.nextLine() is for input a SENTENCE

        System.out.println("The name is :"+ name);
    }
}
