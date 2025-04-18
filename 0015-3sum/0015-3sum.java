class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i <= nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int target = nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = target + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(target, nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
                while(left < right && sum > 0){
                    right--;
                }
                while(left < right && sum < 0){
                    left++;
                }
            }
        }
        return result;
    }
}