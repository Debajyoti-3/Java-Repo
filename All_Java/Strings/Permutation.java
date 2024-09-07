package Strings;

/* str="abc"
permutations : ["abc", "acb", "cba", "bac", "cab", "bca"]
*/
public class Permutation {
    public static void main(String[] args) { // using Subset concept
      permu("","abc");
    }
    static void permu(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return; // base case
        }
        char ch= up.charAt(0);
       for(int i=0; i<=p.length(); i++){
           String f = p.substring(0,i);
           String s = p.substring(i,p.length());
           permu(f+ch+s,up.substring(1));
       }
    }

}
