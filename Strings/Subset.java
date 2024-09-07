  /* str = "abc"
     Subsets = ["a", "b", "c", "ab", "bc", "ac", "abc"]
   */

package Strings;      /* Pattern: taking some elements and removing some elements
                        is known as Subset Pattern */
public class Subset {
    public static void main(String[] args) {
        subseq("","abc");
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p); // printing Subsets
            return; // base case
        }
        char ch= up.charAt(0);
        subseq(p+ch,up.substring(1)); // taking
        subseq(p,up.substring(1));      // rejecting
    }

}
