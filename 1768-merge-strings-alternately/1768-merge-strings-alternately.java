import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int minLength = Math.min(word1.length(), word2.length());

        for(int i = 0; i < minLength; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if(word1.length() > word2.length()) {
            for(int i = minLength; i < word1.length(); i++) {
                sb.append(word1.charAt(i));
            }
        }else if(word2.length() > word1.length()){
            for(int i = minLength; i < word2.length(); i++) {
                sb.append(word2.charAt(i));
            }
        }else{
            sb.toString();
        }

        return sb.toString();
    }
}