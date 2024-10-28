class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        List<String> newArr=new ArrayList<>();

        for(String ns: arr){
            newArr.add(ns);
        }

        Collections.reverse(newArr);

        return String.join(" ",newArr);
    }
}
