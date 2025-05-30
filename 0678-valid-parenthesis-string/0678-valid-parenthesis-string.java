class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(') {
                low += 1;
                high += 1;
            }else if(c == ')') {
                low -= 1;
                high -= 1;
            }else{
                low -= 1;
                high += 1;
            }

            if(low < 0) low = 0;
            if(high < 0) return false;
        }

        return low == 0 ? true: false;
    }
}