class Solution {
    public int maxVowels(String s, int k) {
        int currentVowels=0;
        int maxVowels=0;

        for(int i=0; i<k; i++){
            if(isVowels(s.charAt(i))){
                currentVowels++;
            }
        }
        maxVowels=currentVowels;

        for(int i=k; i<s.length(); i++){
            if(isVowels(s.charAt(i))){
                currentVowels++;
            }

            if(isVowels(s.charAt(i-k))){
                currentVowels--;
            }

            maxVowels=Math.max(currentVowels, maxVowels);
        }

        return maxVowels;
    }

    public boolean isVowels(char c){
        return "aeiou".indexOf(c) != -1;
    }
}