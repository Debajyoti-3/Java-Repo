package Strings;

//Func4 ---> compareTo()

// this func compares the ASCII values of the characters
public class Func4 {
    public static void main(String args[]){
            String one = "Rick";
            String two = "Mitra";  // as R > M
            String god = "Boy";
            String odd = "boy";  // as b > B

            // one > two: +ve value
           // one = two: 0
            // one < two: -ve value

        if(one.compareTo(two)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(odd.compareTo(god)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
