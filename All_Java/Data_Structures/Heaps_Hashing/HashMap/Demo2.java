package Data_Structures.Heaps_Hashing.HashMap;
import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();
        map.put("Debajyoti", 20);
        map.put("Ritika", 17);
        map.put("Niladri", 21);
        map.put("Shrishti", 19);

        System.out.println(map.get("Niladri"));
    }
}
