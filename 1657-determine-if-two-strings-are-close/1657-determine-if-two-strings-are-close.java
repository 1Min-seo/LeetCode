class Solution {
    public boolean closeStrings(String word1, String word2) {
        int []alpha1=new int[26];
        int []alpha2=new int[26];

        for(char c:word1.toCharArray()){
            alpha1[c-'a']++;
        }

        for(char c:word2.toCharArray()){
            alpha2[c-'a']++;
        }

        for(int i=0; i<26; i++){
            if((alpha1[i]==0 && alpha2[i]!=0) || (alpha1[i]!=0 && alpha2[i]==0)){
                return false;
            }
        }

        Arrays.sort(alpha1);
        Arrays.sort(alpha2);

        for(int i=0; i<26; i++){
            if(alpha1[i]!=alpha2[i]){
                return false;
            }
        }
        return true;
        
    }
}
