package in.kumarrahul.leetcode.blind75;

import java.util.HashMap;
import java.util.Map;

public class TwoSumL1 {
    public static void main(String[] args) {
        int [] nums = new int[]{2,7,11,15};
        int target = 9;
        int resultBrute [] = twoSumBruteForce(nums, target);
        System.out.println(nums[resultBrute[0]] + nums[resultBrute[1]]);

        int resultHash [] = twoSumBruteForce(nums, target);
        System.out.println(nums[resultHash[0]] + nums[resultHash[1]]);
    }

    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
