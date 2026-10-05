import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int firstIndex = map.get(complement);
                int secondIndex = i;
                // Ensures indices are in ascending order
                return new int[]{Math.min(firstIndex, secondIndex), Math.max(firstIndex, secondIndex)};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // Fallback if no pair exists
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
