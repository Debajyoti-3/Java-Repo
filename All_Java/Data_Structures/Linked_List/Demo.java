package Data_Structures.Linked_List;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedList <String> list= new LinkedList<String>();   // using Java Collection Framework

        // Addition Operation
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+"-> ");
        }
        System.out.println("null");

        // Delete Operation

//        list.removeLast();
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        list.removeFirst();
//        System.out.println(list);
        list.reversed();
        System.out.println(list.reversed());
    }
}
