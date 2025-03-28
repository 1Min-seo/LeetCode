class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm=new HashMap<>();
    
        Arrays.sort(nums);
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
            if(hm.get(num)>1) return true;
            
        }

        return false;
        
    }
}

/**
    두개 이상 있는게 있으면 true

    1. 정렬을 한다
    1 1 2 3
    해시 사용하면 되지 않을깜..?
    1 2
    2 1
    3 1

    을 해서 1이 아니면 바로 트루..
 */