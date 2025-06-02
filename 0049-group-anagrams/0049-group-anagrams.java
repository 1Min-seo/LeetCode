import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for(String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            hm.putIfAbsent(key, new ArrayList<>());

            hm.get(key).add(str);
        }

        return new ArrayList<>(hm.values());
    }
}