//Count occurrences of each character in an array using Map
package MOREONCOLLECTION;
import java.util.*;
public class Test7 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'b', 'a'};
        Map<Character, Integer> map = new HashMap<>();

        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
