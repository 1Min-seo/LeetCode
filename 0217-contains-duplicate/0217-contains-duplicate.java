class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]) return true;
        }

        return false;
    }
}
/**
    적어도 두번 나오면 true
    정렬해서 앞뒤로 같은게 나오면 true
 */