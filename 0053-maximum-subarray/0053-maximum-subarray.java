class Solution {
    public int maxSubArray(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        int answer = arr[0];

        for(int i = 1; i < nums.length; i++) {
            arr[i] = Math.max(arr[i - 1] + nums[i], nums[i]);
            answer = Math.max(answer, arr[i]);
        }

        return answer;
    }
}