class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int amount= 0;
        int result = 0;
        while(left < right) {
            amount = (right - left) * Math.min(height[left], height[right]);

            if(left < right && height[left] < height[right]) {
                left++;
            }else{
                right--;
            }

            result = Math.max(result, amount);
        }
        return result;
    }
}