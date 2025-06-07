import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int left = 0;
        int result = 0;

        for(int right = 0; right < s.length(); right++) {
            while(!hs.add(s.charAt(right))) {
                hs.remove(s.charAt(left));
                left++;
            }

            hs.add(s.charAt(right));

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}