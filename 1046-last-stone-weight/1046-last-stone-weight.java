class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ston : stones){
            pq.add(ston);
        }
        
        while(pq != null){
            int stone1 = pq.poll();
            int stone2 = pq.poll();

            if(stone1 > stone2) {
                pq.add(stone1 - stone2);
            }
        }

        Integer result = pq.peek();
        return result == null ? 0 : result;
    }
}