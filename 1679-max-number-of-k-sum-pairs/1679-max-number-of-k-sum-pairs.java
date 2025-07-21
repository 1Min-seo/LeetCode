import java.util.*;
class Solution {
    public int maxOperations(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;

        Arrays.sort(nums);

        while(left < right) {
            while(left < right && nums[left] + nums[right] < k) {
                left++;
            }

            while(left < right && nums[left] + nums[right] > k) {
                right--;
            }

            if(left < right && nums[left] + nums[right] == k) {
                left++;
                right--;
                ans++;
            }
        }
        
        return ans;
    }
}