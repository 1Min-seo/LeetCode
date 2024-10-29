class Solution {
    public int[] productExceptSelf(int[] nums) {  
        int []result=new int[nums.length];
        result[0]=1;

        //left sum
        for(int i=1; i<nums.length; i++){
            result[i]=nums[i-1]*result[i-1];
        }

        //right sum
        int right=1;
        for(int i=result.length-1; i>=0; i--){
            result[i]=right*result[i];
            right*=nums[i];
        }

        return result;
        
    }
}