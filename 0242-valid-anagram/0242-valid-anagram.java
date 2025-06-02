import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            hm.put(c, hm.getOrDefault(c, 0) - 1);
        }

        for(int i : hm.values()) {
            if(i != 0) return false;
        }

        return true;
        
    }
}