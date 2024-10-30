class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int result[]=new int[height.length];
        int width=0;
        int vertical=0;

        while(left<right){
            for(int i=0; i<result.length; i++){
                width=right-left;
                vertical=Math.min(height[left], height[right]);
                result[i]=width*vertical;

                if(height[left]>height[right]){
                    right--;
                }else{
                    left++;
                }
            }
        }

        Arrays.sort(result);
        return result[result.length-1];
    }
}