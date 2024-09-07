package Strings;

public class Substring {
    public static void main(String args[]){
        String one = "Rick Mitra";
        String two = "Batman";

        // substring(beg index,end index)
        System.out.println(one.substring(2,one.length()));
        System.out.println(two.substring(3));   // if we do not put end index then automatically
    }                                                     //it takes last index as end index
}
