class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums){
            pq.add(num);
        }

        for (int i = 0; i < k - 1; i++){
            System.out.println("삭제: " + pq.peek());
            pq.poll();
        }

        return pq.peek();
    }
}

/**
    6 5 4 3 2 1
 */