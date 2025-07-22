class WordDictionary {
    List<String> dic;
    public WordDictionary() {
        dic = new ArrayList<>();
    }
    
    public void addWord(String word) {
        dic.add(word);
    }
    
    public boolean search(String word) {
        for(String w : dic) {
            if(w.length() != word.length()) continue;

            boolean matched = true;
            for(int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == '.') continue;
                if(word.charAt(i) != w.charAt(i)) {
                    matched = false;
                    break;
                }
            }
            if(matched) return true;
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */