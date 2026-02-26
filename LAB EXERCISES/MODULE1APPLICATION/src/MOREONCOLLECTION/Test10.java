//Print Anagrams using Map
package MOREONCOLLECTION;
import java.util.*;

public class Test10 {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art"};
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        System.out.println("Anagrams:");
        for (List<String> group : map.values()) {
            if (group.size() > 1)
                System.out.println(group);
        }
    }
}
