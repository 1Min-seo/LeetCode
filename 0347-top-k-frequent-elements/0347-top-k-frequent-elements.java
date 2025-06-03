import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        //내림차순 (x, y) => (num, 빈도수)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for(int key : freqMap.keySet()) {
            pq.offer(new int[] {key, freqMap.get(key)});
        }

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = pq.poll()[0];
            // int [] a ->> {x,y} {3이 4번나왔음}

        }

        return result;
        
    }
}
/**
    1   3
    2   2
    3   1
 */