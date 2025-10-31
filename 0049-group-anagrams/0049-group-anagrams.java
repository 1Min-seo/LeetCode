import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for(String str : strs) {
            char[] target = str.toCharArray();
            Arrays.sort(target);
            String key = new String(target);

            if(!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(str);
        }

        return new ArrayList<>(hm.values());
    }
}