class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs=new HashSet<>();
    
        Arrays.sort(nums);
        for(int num: nums){
            if(!hs.add(num)) return true;
        }

        return false;
        
    }
}

/**
    두개 이상 있는게 있으면 true

    1. 정렬을 한다
    1 1 2 3
    해시 사용하면 되지 않을까
    중복된 add 연산이 있으면 true 반환
 */