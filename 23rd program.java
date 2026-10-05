import java.util.HashSet;
import java.util.Set;

public class DistinctAbsoluteValues {
    public static int countDistinctAbsValues(int[] arr) {
        Set<Integer> uniqueAbsSet = new HashSet<>();

        for (int num : arr) {
            uniqueAbsSet.add(Math.abs(num));
        }

        return uniqueAbsSet.size();
    }

    public static void main(String[] args) {
        int[] arr = {-5, 5, 2, -2, -3, 0, 1};
        System.out.println("Number of distinct absolute values: " + countDistinctAbsValues(arr));
    }
}
