package OOPs;

public class Wrapper_Class {
    public static void main(String[] args) {
        int a = 10; // this is primitive not Object
        int c = 30;
        Integer b = 50;
        Integer d = 20;  // this is an Object
        /* swap(a, c);
        System.out.println(a + " "+ c);
    }                                    // This Swap will not execute as there is
    static void swap(int a,int c){        no Pass by Reference in java
        int temp = a;
        a=c;
        c=temp;
    }*/
        /* (a, c);
        System.out.println(b + " "+ d);   // this will also not Swap as Integer is in final Class
    }
    static void swap(Integer b, Integer d){
        Integer temp = b;
        b=d;
        d=temp; */

        //final int e =8;
        //e=7;  // we can't change variable's value as it is final
       

    }
}
