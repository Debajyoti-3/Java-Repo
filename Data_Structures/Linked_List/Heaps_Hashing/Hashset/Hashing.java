package Data_Structures.Heaps_Hashing.Hashset;
import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {

        // Creating
        HashSet<Integer> set = new HashSet<>();  // using Collection Framework

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        // search - contains
        if(set.contains(1)){
            System.out.println("set conatains 1");
        }
        if(!set.contains(7)){
            System.out.println("does not contain");
        }

        // Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("1 deleted");
        }

        // Size
        System.out.println("the size of the set is: "+ set.size());

        // print all elements
        System.out.println(set);

        // Iterator     ***
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


}
