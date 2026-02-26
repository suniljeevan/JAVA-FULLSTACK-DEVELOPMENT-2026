//Find duplicates and remove duplicates from array using HashMap
package MOREONCOLLECTION;
import java.util.*;
public class Test8 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10, 40, 20, 50};
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println(entry.getKey());
        }

        System.out.println("\nArray after removing duplicates:");
        Set<Integer> unique = map.keySet();
        System.out.println(unique);
    }
}
