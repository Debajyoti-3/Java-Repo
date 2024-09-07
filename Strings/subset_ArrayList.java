package Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class subset_ArrayList {
      /* str = "abc"
     Subsets = ["a", "b", "c", "ab", "bc", "ac", "abc"]
   */

                                /* Pattern: taking some elements and removing some
                               elements is known as Subset Pattern */
        public static void main(String[] args) {
            System.out.println(subseqRet("", "abc"));
        }
        static ArrayList<String> subseqRet(String p, String up){
            if(up.isEmpty()){
                ArrayList<String> list= new ArrayList<>();   // base case
                list.add(p);
                return list;
            }
            char ch= up.charAt(0);
            ArrayList<String> left=subseqRet(p+ch,up.substring(1)); // taking
            ArrayList<String> right=subseqRet(p,up.substring(1));      // rejecting

            left.addAll(right);
            return left;
        }

    }


