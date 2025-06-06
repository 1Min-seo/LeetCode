
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Alpha = new int[26];
        int[] s2Alpha = new int[26];
        int left = 0;

        if (s1.length() > s2.length()) return false;

        for(int i = 0; i < s1.length(); i++) {
            s1Alpha[s1.charAt(i) - 'a']++;
            s2Alpha[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1Alpha, s2Alpha)) return true;

        for(int i = s1.length(); i < s2.length(); i++) {
            s2Alpha[s2.charAt(i) - 'a']++;
            s2Alpha[s2.charAt(i - s1.length()) - 'a']--;

            if(Arrays.equals(s1Alpha, s2Alpha)) return true;
        }

        return false;
    }
}