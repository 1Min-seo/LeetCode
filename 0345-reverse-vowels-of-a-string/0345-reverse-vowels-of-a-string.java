class Solution {
    public String reverseVowels(String s) {
        char []ch=s.toCharArray();

        String vowels="aeiouAEIOU";

        int left=0;
        int right=ch.length-1;

        while(left<right){
            while(left<right && vowels.indexOf(ch[left])==-1){
                left++;
            }

            while(left<right && vowels.indexOf(ch[right])==-1){
                right--;
            }


            System.out.print(ch[left]+" "+ch[right]);
            System.out.println();

            char tmp=ch[left];
            ch[left]=ch[right];
            ch[right]=tmp;

            left++;
            right--;
        }

        return new String(ch);

    }
}
