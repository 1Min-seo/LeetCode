class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String change = new String(ch);
            if(!hm.containsKey(change)){
                hm.put(change, new ArrayList<>());
            }
            hm.get(change).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
