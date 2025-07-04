class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;

        while(i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));

            i++;
            j++;
        }

        while(i < word1.length()) {
            sb.append(word1.charAt(i));
            i++;
        }

        while(j < word2.length()) {
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}