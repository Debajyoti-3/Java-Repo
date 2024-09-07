package Strings;

public class Permutation_count {


    /* str="abc"
    permutations : ["abc", "acb", "cba", "bac", "cab", "bca"]
    */

        public static void main(String[] args) {
            System.out.println("No.of permutations are: "+permuCount("","abc"));
        }
        static int permuCount(String p, String up){    // no of Permutations are : n! (here 3! = 6)
            if(up.isEmpty()){
                return 1; // base case
            }
            int count =0;
            char ch= up.charAt(0);
            for(int i=0; i<=p.length(); i++){
                String f = p.substring(0,i);
                String s = p.substring(i,p.length());
                count = count+permuCount(f+ch+s,up.substring(1));
            }
            return count;
        }

    }


