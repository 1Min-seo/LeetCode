class Solution {
    public int[] productExceptSelf(int[] nums) {  
       int []result=new int[nums.length];
        result[0]=1;

        for(int i=1; i<nums.length; i++){
            result[i]=nums[i-1]*result[i-1];
            System.out.print(result[i]+", ");
        }
        System.out.println();
        //num   [1,    2, 3,4]
        //result 1     1  2 6
        //right 2*3*4 3*4 4 1
        //result 

        int []right=new int[nums.length];
        right[nums.length-1]=1;
        for(int i=nums.length-2; i>=0; i--){
            right[i]=right[i+1]*nums[i+1];
        }
        for(int rightValue:right){
            System.out.print(rightValue+" ");
        }

        for(int i=0; i<nums.length; i++){
            result[i]=result[i]*right[i];
        }
        return result;

    }
}
