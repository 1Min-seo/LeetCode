class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int target=0;
        
        for(int i=0; i<nums.length-1; i++){
            target=i;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int start=target+1;
            int end=nums.length-1;

            while(start<end){
                int sum=nums[target]+nums[start]+nums[end];
                if(sum==0){
                    List<Integer>added=new ArrayList<>();
                    added.add(nums[target]);
                    added.add(nums[start]);
                    added.add(nums[end]);
                    result.add(added);

                    while(start<end && nums[start] == nums[start+1]) start++;
                    while(start<end && nums[end]== nums[end-1]) end--;

                    start++;
                    end--;
                }else if(sum<0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return result;
    }
}