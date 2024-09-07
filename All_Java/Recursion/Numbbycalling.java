package Recursion;

public class Numbbycalling {
    public static void main(String[] args) {

        //print the number 1 to 5 in function calling
        // use recursion topic
        number1(1);
    }
    public static void number1(int n){
        System.out.println(n);
        number2(2);

    }
    public static void number2(int n){
        System.out.println(n);
        number3(3);

    }

    public static void number3(int n){
        System.out.println(n);
        number4(4);

    }
    public static void number4(int n){
        System.out.println(n);
        number5(5);

    }
    public static void number5(int n){
        System.out.println(n);

    }
}
