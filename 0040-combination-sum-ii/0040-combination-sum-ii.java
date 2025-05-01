class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, new ArrayList<>(), target, 0, 0);
        return result;
    }

    public void dfs(int[] candidates, List<Integer> curr, int target, int idx, int sum){
        if(target == sum) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if(target < sum) return;

        for(int i = idx; i < candidates.length; i++) {
            if(i > idx && candidates[i] == candidates[i - 1]) continue;
            curr.add(candidates[i]);
            dfs(candidates, curr, target, i + 1, sum + candidates[i]);
            curr.remove(curr.size() - 1);
        }
    }
}
