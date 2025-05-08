class Solution {
    public int rob(int[] nums) {
       //첫번째 집을 털었을 때 vs 안 털었을 때
        int result = 0;

        if(nums.length == 1) return nums[0];

        result = Math.max(dyp(nums, 0, nums.length - 2), dyp(nums, 1, nums.length - 1));
        return result;
    }

    private int dyp(int[] nums, int start, int end) {
        int prev1 = 0;
        int prev2 = 0;

        for(int i = start; i <= end; i++) {
            int tmp = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = tmp;
        }

        return prev1;
    }

}