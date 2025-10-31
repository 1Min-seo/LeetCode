import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();

        for(char c : s.toCharArray()) {
            hm1.put(c, hm1.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            hm2.put(c, hm2.getOrDefault(c, 0) + 1);
        }

        return hm1.equals(hm2) ? true : false;
    }
}