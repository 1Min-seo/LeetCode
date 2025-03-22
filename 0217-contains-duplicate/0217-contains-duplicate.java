class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int prev=nums[0];

        for(int i=0; i<nums.length-1; i++){
           if(prev==nums[i+1]){
            return true;
           }
           prev=nums[i+1];
        }

        return false;
    }

}

/**
   정렬을 하면 1 1 2 3

 */