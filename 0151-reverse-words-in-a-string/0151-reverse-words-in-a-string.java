class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
                     
        List<String> newArr=new ArrayList<>();

        for(String x:arr){
            newArr.add(x);
        }

        Collections.reverse(newArr);

        return String.join(" ", newArr);
    }
}
