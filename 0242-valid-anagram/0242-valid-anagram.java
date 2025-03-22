class Solution {
    public boolean isAnagram(String s, String t) {
        String copy=t;

        char []sorted=s.toCharArray();
        char []sortedCopy=copy.toCharArray();

        Arrays.sort(sorted);
        Arrays.sort(sortedCopy);


        System.out.println(sorted);
        System.out.println(sortedCopy);

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            if(sorted[i]!=sortedCopy[i]) return false;
        }

        return true;
    }
}