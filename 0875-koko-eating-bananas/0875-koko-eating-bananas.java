class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMaxPile(piles);

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long hours = getTotalHours(piles, mid);

            if (hours <= h) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private long getTotalHours(int[] piles, int k) {
        long total = 0;
        for (int pile : piles) {
            total += (pile + k - 1) / k;
        }
        return total;
    }

    private int getMaxPile(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            if (pile > max) max = pile;
        }
        return max;
    }
}