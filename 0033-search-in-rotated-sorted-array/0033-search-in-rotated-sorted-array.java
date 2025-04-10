class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right ){
            int mid = (left + right) / 2;

            if(left == right) break;

            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        for(int i = left; i < nums.length; i++){
            if(nums[i] == target) return i;
        }
        return -1;
             
    }
}
