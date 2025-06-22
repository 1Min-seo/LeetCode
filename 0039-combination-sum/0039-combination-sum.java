class Solution {
    List<List<Integer>> result;
    List<Integer> current;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        current = new ArrayList<>();

        back(candidates, target, 0, 0);
        return result;
    }

    private void back(int[] candidates, int target, int currentSum, int startIndex) {
        if(currentSum == target) {
            result.add(new ArrayList<>(current));
        }

        if(currentSum > target) return;

        for(int i = startIndex; i < candidates.length; i++) {
            current.add(candidates[i]);

            back(candidates, target, currentSum + candidates[i], i);
            current.remove(current.size() - 1);
        }
        
    }
}