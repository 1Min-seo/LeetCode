class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(dist(b), dist(a))
        );
        for(int[] point: points) {
            pq.offer(point);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++){
            result[i] = pq.poll();
        }
        return result;
    }
    private int dist(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }
}