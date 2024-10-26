class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int str1Size=str1.length();
        int str2Size=str2.length();

        for(int i=Math.min(str1Size, str2Size); i>0; i--){
            if(valid(str1, str2, i)){
                return str1.substring(0,i);
            }
        }
        return "";
    }

    public boolean valid(String a, String b, int k){
        int aSize=a.length();
        int bSize=b.length();

        String base=b.substring(0,k);

        if(aSize%k==0 && bSize%k==0){
            return a.replace(base,"").isEmpty() && b.replace(base,"").isEmpty();
        }else return false;

    }
}
