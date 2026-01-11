package in.kumarrahul.leetcode.blind75;

public class MaxSubArrayL53 {
    public static void main(String[] args) {
        int [] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSub = nums[0];

        int currSum = 0;
        for(int i=0; i< nums.length; i++){
            if(currSum < 0){
                currSum = 0;
            }
            currSum += nums[i];
            maxSub = Math.max(maxSub, currSum);
        }
        return maxSub;
    }

}
