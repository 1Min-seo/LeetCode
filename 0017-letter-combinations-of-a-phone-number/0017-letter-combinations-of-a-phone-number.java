class Solution {
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return result;

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        dfs(map, digits, 0, new StringBuilder());
        return result;
    }

    private void dfs(Map<Character, String> map, String digits, int idx, StringBuilder path){
        if(idx == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = map.get(digits.charAt(idx));
        for(int i = 0; i < letters.length(); i++) {
            path.append(letters.charAt(i));
            dfs(map, digits, idx + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}