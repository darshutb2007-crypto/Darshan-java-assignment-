import java.util.*;

public class AnagramicGroups {
    public static int countAnagramicGroups(String[] strs) {
        Set<String> groups = new HashSet<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            groups.add(sortedStr);
        }

        return groups.size();
    }

    public static void main(String[] args) {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Number of anagramic groups: " + countAnagramicGroups(strings));
    }
}
