package Strings;

public class skip_String {
    public static void main(String[] args) {
        System.out.println(skipString("bcapplede"));
    }

        static String skipString( String up){        //up = unProcessed
            if(up.isEmpty()){
                return "";           // Base Case
            }

            if(up.startsWith("apple")){          // skipping the string "apple"
                return skipString(up.substring(5));
            }
            else{
                return up.charAt(0)+skipString(up.substring(1));
            }
        }
    }


