class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char num = board[i][j];
                if (num == '.') continue;

                if (!hs.add(num + " in row " + i) || 
                    !hs.add(num + " in col " + j) || 
                    !hs.add(num + " in box " + (i/3) + "-" + (j/3))) {
                    return false; // 중복이면 잘못된 스도쿠!
                }
            }
        }

        return true;
    }
}
