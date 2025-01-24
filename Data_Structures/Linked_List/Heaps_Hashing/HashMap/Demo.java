package Data_Structures.Heaps_Hashing.HashMap;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        // key(string)  value(integer)
        HashMap<String, Integer> map = new HashMap<>();



        // Insertion

        map.put("India", 191);
        map.put("USA", 44);
        map.put("China", 435);

        System.out.println(map);

        map.put("China", 200);
        System.out.println(map);



        // Search (look up)

        if(map.containsKey("Thailand")){
            System.out.println("Key Present");
        }
        else{
            System.out.println("Key Not Present");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("Norway"));



        // Iteration  for(int val : arr

        for(Map.Entry<String, Integer> element : map.entrySet()){
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }

//        Set<String> keys = map.keySet();  // Not Preferable
//        for(String key : keys){
//            System.out.println(key +" "+ map.get(key));
//        }



        // Remove

        map.remove("China");
        System.out.println(map);

    }
}
