class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;

        while(left < right){
            int ans = ((right - left ) * Math.min(height[left], height[right]));

            if(left < right && height[left] < height[right]){
                left++;
            }else if(left < right && height[left] >= height[right]){
                right--;
            }

            result = Math.max(result, ans);        
        }

        return result;
    }
}

/**
    left = 0 right = 8
    
 */