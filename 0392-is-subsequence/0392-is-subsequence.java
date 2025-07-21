class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) return true;
        
        int point = 0;
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == s.charAt(point)) {
                point++;
            }

            if(point == s.length()) return true;
        }

        return false;
    }
}