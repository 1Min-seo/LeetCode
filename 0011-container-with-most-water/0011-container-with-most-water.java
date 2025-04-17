class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;

        while(left < right){
            int container = (right - left) * (Math.min(height[left], height[right]));
            result = Math.max(result, container);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return result;
    }
}
/**
    정렬X
    높이를 비교해서 작으면 작은 쪽에서 옮기기
 */