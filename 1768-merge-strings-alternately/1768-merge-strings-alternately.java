class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1Size=word1.length();
        int w2Size=word2.length();
        StringBuilder sb=new StringBuilder();

        for(int i=0; i<Math.max(w1Size, w2Size); i++){
            if(i<w1Size){
                sb.append(word1.charAt(i));
            }
            if(i<w2Size){
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}
