package in.kumarrahul.leetcode.blind75;

public class ProductExceptSelfL238 {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3,4};
        int [] result = productExceptSelf(nums);
        for(int num: result){
            System.out.print(num + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        result[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            result[i + 1] = nums[i] * result[i];
        }

        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = suffix * result[i];
            suffix = suffix * nums[i];
        }

        return result;
    }

}
