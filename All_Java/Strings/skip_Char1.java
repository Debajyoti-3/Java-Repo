package Strings;
                           // METHOD-1(2 Argument)
public class skip_Char1 {
    public static void main(String[] args) {
        skip("","abbacda");
    }
    static void skip(String p, String up){   // p: processed
        if(up.isEmpty()){                    // up: unprocessed
            System.out.println(p);  // Base Case
            return;
        }
        char ch = up.charAt(0);    // skipping the 'a' letter
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
}
