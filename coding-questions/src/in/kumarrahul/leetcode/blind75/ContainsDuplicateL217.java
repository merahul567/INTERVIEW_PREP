package in.kumarrahul.leetcode.blind75;

import java.util.Arrays;

public class ContainsDuplicateL217 {
    public static void main(String[] args) {
        int [] nums = new int[]{2,7,11,11};
        System.out.println(containsDuplicateBruteForce(nums));
        System.out.println(containsDuplicateSorting(nums));
        System.out.println(containsDuplicateHashSet(nums));
    }

    public static boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateSorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateHashSet(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
