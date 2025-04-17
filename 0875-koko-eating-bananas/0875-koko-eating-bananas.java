class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int pile : piles){
            if(pile > right) right = pile;
        }

        while(left <= right){
            int mid = left + (right - left) / 2;
            int result = 0;
            for(int pile : piles){
                result += Math.ceil((pile + mid - 1) / mid);
            }
            if(result <= h){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}