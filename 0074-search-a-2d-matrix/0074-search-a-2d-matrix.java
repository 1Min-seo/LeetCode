class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rLength = matrix.length;
        int cLength = matrix[0].length;
        int left = 0;
        int right = cal(new int[]{rLength - 1, cLength - 1}, rLength, cLength);

        while(left <= right){
            int[] mid = toCoord((left + right) / 2, rLength, cLength);

            int guess = matrix[mid[0]][mid[1]]; 
            if (guess == target) return true;
            
            if (guess < target) {
                left = cal(mid, rLength, cLength) + 1;
            }
            else {
                right = cal(mid, rLength, cLength) - 1;
            }
        }
        return false;
    }

    public int cal(int[] coord, int rLength, int cLength){
        return cLength * coord[0] + coord[1];
    }

    //수직선을 좌표로..
    public int[] toCoord(int dot, int rLength, int cLength) {
        int x = dot / cLength;
        int y = dot % cLength;

        return new int[] {x, y};
    }
}