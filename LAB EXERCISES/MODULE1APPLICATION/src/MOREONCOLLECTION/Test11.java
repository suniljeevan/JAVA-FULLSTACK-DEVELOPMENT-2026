//Given a string, print all possible combinations using Collections
package MOREONCOLLECTION;
import java.util.*;

public class Test11 {
    public static void main(String[] args) {
        String str = "ABC";
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) list.add(c);

        System.out.println("All combinations:");
        generateCombinations(list, 0);
    }

    static void generateCombinations(List<Character> list, int index) {
        if (index == list.size() - 1) {
            System.out.println(list);
            return;
        }

        for (int i = index; i < list.size(); i++) {
            Collections.swap(list, i, index);
            generateCombinations(list, index + 1);
            Collections.swap(list, i, index);
        }
    }
}
