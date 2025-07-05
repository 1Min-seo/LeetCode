import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');


        char[] ch = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            while(left < right && !vowels.contains(ch[left])) {
                left++;
            }
            while(left < right && !vowels.contains(ch[right])) {
                right--;
            }

            if(left < right) {
                char tmp = ch[left];
                ch[left] = ch[right];
                ch[right] = tmp;

                left++;
                right--;
            }
        }

        return new String(ch);
    }
}