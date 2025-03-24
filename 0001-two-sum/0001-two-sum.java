class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hp=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int comp=target-nums[i];
            if(hp.containsKey(comp)){
                return new int[]{hp.get(comp), i};
            }
            hp.put(nums[i], i);
        }
        return new int[]{};
    }
}