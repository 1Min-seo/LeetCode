class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int m: candies){
            max=Math.max(m,max);
        }
    
        List<Boolean> result=new ArrayList<>();

        for(int x:candies){
            x+=extraCandies;

            if(x>=max){
                result.add(true);
            }else result.add(false);
        }

        return result;
    }
}