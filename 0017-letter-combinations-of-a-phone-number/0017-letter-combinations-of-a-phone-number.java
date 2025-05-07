class Solution {
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return result;

        Map<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");

        dfs(hm, digits, 0, new StringBuilder());

        return result;
    }

    private void dfs(Map<Character, String> hm, String digits, int idx, StringBuilder sb){
        if(idx == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String letters = hm.get(digits.charAt(idx));
        for(int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            dfs(hm, digits, idx + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }    
}