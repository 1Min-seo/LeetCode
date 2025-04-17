class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0;
        int right = row * col - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int mid_value = matrix[mid / col][mid % col];

            if(mid_value > target){
                right = mid - 1;
            }else if(mid_value < target){
                left = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}