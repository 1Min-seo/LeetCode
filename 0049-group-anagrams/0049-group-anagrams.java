import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(str);
        }

        result.addAll(hm.values());
    
        return result;
    }
}
