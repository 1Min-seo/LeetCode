class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if(nums.length == 1){
            if(nums[0] == target) return 0;
            else return -1;
        }
        while(left <= right){
            int mid = (left + right) / 2;

            if(left <= right && nums[mid] < target){
                left = mid + 1;
            }
            else if(left <= right && nums[mid] > target){
                right = mid - 1;
            }
            if(nums[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}