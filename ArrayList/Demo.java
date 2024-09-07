package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // ArrayList<Float> list1 = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<Integer>();

        // add elements
        list.add(2);
        list.add(7);
        list.add(4);
        System.out.println(list);

        // get elements
        int element = list.get(1);
        System.out.println(element);

        // add element in between
        list.add(1,5);
        System.out.println(list);

        // set element
        list.set(0,9);  // index,new element
        System.out.println(list);

        // delete element
        list.remove(2);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        // Loop
        for(int elmnt: list){        // using for each loop
            System.out.println(elmnt+" ");
        }

        // sorting
        Collections.sort(list);   // Ascending order
        System.out.println(list);

    }
}
