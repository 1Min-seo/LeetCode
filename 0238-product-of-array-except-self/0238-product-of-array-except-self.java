class Solution {
    public int[] productExceptSelf(int[] nums) {  
        int[] result=new int[nums.length];

        result[0]=1;
        for(int i=1; i<nums.length; i++){
            result[i]=result[i-1]*nums[i-1];
        }

        int []right=new int[nums.length];
        right[nums.length-1]=1;
        for(int i=nums.length-2; i>=0; i--){
            right[i]=right[i+1]*nums[i+1];
        }

        for(int i=0; i<nums.length; i++){
            result[i]= result[i]*right[i];
        }

        return result;
    }
}

