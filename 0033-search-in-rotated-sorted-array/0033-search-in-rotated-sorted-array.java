import java.util.*;
class Solution {
    public int search(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);

            if(hm.containsKey(target)) return hm.get(target);
        }

        return -1;

    }
}