class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int result = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            while(hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            result = Math.max(result, right - left);
        }

        return result + 1;
    }
}