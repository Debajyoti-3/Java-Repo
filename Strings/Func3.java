package Strings;

//Func3 ---> charAt

public class Func3 {

        public static void main(String args[]){
            String one = "Rick";
            String two = "Mitra";

            String concat = one + two;
            for(int i=0; i<concat.length();i++){
                System.out.println(concat.charAt(i));   //charAt divides the string in letter bye letter
            }
        }
    }


