class Solution {
    List<List<Integer>> result;
    List<Integer> current;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        result = new ArrayList<>();
        current = new ArrayList<>();

        Arrays.sort(candidates);
        back(candidates, target, 0, 0);
        return result;
    }

    private void back(int[] candidates, int target, int currentSum, int index) {
        if(currentSum == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        if(currentSum > target) return;

        for(int i = index; i < candidates.length; i++) {
            if(i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            current.add(candidates[i]);
            back(candidates, target, currentSum + candidates[i], i + 1);

            current.remove(current.size() - 1);
        }
    }
}