class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMaxPile(piles);

        while(left <= right){
            int mid = left + (right - left) / 2 ;
            long total = 0;
            for(int pile : piles){
                total += (pile + mid - 1) / mid;
            }

            if(total <= h){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;

    }

    //최댓값 구하기
    private int getMaxPile(int[] piles){
        int max = 0;
        for(int pile : piles){
            if(max < pile) max = pile;
        }

        return max;
    }
}