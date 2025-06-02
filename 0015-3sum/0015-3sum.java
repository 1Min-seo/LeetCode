class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int fixed = 0; fixed < nums.length - 2; fixed++) {
            if(fixed > 0 && nums[fixed] == nums[fixed - 1]) continue;

            int left = fixed + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[fixed] + nums[left] + nums[right];

                if(sum == 0) {
                    List<Integer> result = new ArrayList<>();
                    result.add(nums[fixed]);
                    result.add(nums[left]);
                    result.add(nums[right]);

                    answer.add(result);

                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;

                }else if(sum < 0) {
                   left++;
                }else {
                    right--;
                }
            }      
        }
        return answer;
    }
}
/**
    -4 -1 -1 0 1 2
 */