package Recursion;

public class NumbByRecursion {

        public static void main(String[] args) {

            //print the number 1 to 5 in function calling
            // use recursion topic
            number1(1);
        }
        public static void number1(int n){
            if (n>5){
                return;    // Base Case
            }
            System.out.println(n);
            number1(n+1);

        }

    }


