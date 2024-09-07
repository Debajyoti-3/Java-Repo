package Algorithms;

public class LS_inString {

    public static boolean LSString(String str,char target){

        if(str.length()==0){
            return false;
        }

        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
    String Name= "Debajyoti";
    char target= 'r';
    boolean ans=LSString(Name,target);
        System.out.println(ans);

    }
}
