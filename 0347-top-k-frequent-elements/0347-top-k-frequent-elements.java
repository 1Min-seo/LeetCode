class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result=new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();

        Arrays.sort(nums);
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        //keySet()을 이용해 빈도수를 기준으로 정렬하기 위해 set을 List로 변환
        List<Integer> sortedKeys= new ArrayList<>(hm.keySet());

        sortedKeys.sort((a,b) -> hm.get(b)-hm.get(a));

        for(int i=0; i<k; i++){
            result[i]=sortedKeys.get(i);
        }

        return result;

    }
}

/**
    먼저 정렬을 해야하지 않을까?
    1 1 1 2 2 3

    해시를 써야하지 않을까
    num이 키
    카운트가 벨류
    hash
    1   3
    2   2
    3   1


 */