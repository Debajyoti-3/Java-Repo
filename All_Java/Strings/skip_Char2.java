package Strings;         // METHOD-2(1 Argument)

public class skip_Char2 {
    public static void main(String[] args) {
        System.out.println(skip("abbacdea"));
    }
    static String skip( String up){         //
        if(up.isEmpty()){
            return "";                 // Base Case
        }
        char ch = up.charAt(0);    // skipping the 'a' letter
        if(ch=='a'){
            return skip(up.substring(1));
        }
        else{
            return ch+skip(up.substring(1));
        }
    }
}
