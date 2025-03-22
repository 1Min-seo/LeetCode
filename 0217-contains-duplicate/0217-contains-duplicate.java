class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i=0; i<nums.length-1; i++){
           if(nums[i]==nums[i+1]) return true;
        }

        return false;
    }

}

/**
   정렬을 하면 1 1 2 3

 */