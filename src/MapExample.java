import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(123, "salt");
        System.out.println("first instance of the key= " + map.get(123));

        map.put(123, "peber");
        System.out.println("after changing the string for key 123= " + map.get(123));

        map.remove(123); //map.clear fjerner alt
        System.out.println("after removing the key= " + map.containsKey(123));

        //Iteration gennem et hashmap
        map.put(1, "havsalt");
        map.put(2, "chili");

        System.out.println();


        System.out.println("ITERATOR GOING THROUGH KEYS:");
        Iterator<Integer> keyIterator = map.keySet().iterator();
        while (keyIterator.hasNext()) {
            System.out.println(keyIterator.next());
        }

        //HashMap er hurtige at søge igennem men man kan ikke garantere at der er orden
        //i hashmappet når man iterere igennem det, til det er treemap bedre, det laver orden.

        Map<Integer, String> hashSet = new TreeMap<>(); //

    }
}
