class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        dfs(nums, new ArrayList<>(), nums.length, 0);
        return result;
    }

    public void dfs(int[]nums, List<Integer> curr, int length, int idx){
        if(curr.size() == length){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(curr.contains(nums[i])) continue;
            curr.add(nums[i]);
            dfs(nums, curr, length, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}