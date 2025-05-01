class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target, new ArrayList<>(), 0, 0);
        return result;
    }

    public void dfs(int[] candidates, int target, List<Integer> curr, int sum, int idx){
        if(sum == target) {
            result.add(new ArrayList<>(curr));
            return;
        }
        
        if(sum > target) return;

        for(int i = idx; i < candidates.length; i++) {
            curr.add(candidates[i]);
            dfs(candidates, target, curr, sum + candidates[i], i);
            curr.remove(curr.size() - 1);
        }
    }
}