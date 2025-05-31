import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> hmS = new HashMap<>();
        Map<Character, Integer> hmT = new HashMap<>();

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            hmS.put(cs, hmS.getOrDefault(cs, 0) + 1);
            hmT.put(ct, hmT.getOrDefault(ct, 0) + 1);
        }

        return hmS.equals(hmT);
    }
}