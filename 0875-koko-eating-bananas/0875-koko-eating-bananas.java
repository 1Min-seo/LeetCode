class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = maxPile(piles);

        while (left <= right){
            int mid = left + (right - left) / 2;
            long total = totalPile(piles, mid);

            if(total <= h){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    //ceil로 total 구하기
    private long totalPile(int[] piles, int mid){
        long total = 0;
        for(int pile : piles){
            total += (pile + mid -1) / mid;
        }
        return total;
    }

    //가장 큰 값 구하기
    private int maxPile(int[] piles){
        int max = 0;
        for(int pile : piles){
            if(max < pile) max = pile;
        }

        return max;
    }
}