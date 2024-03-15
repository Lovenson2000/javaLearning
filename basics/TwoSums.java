import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such
 * that they add up to target.
 */
public class TwoSums {

    static int[] findIndexes(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(numbers[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 4, 8, 18, 5, 9, 6 };
        int target = 24;
        int[] indices = findIndexes(nums, target);

        if (indices[0] != -1 && indices[1] != -1) {
            System.out.println(indices[0] + ", " + indices[1]);

        } else {
            System.out.println("No two sum solution.");
        }
    }
}
