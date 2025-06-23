class Solution {
    List<List<Integer>> result;
    List<Integer> curr;
    boolean[] visited;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList<>();
        curr = new ArrayList<>();
        visited = new boolean[nums.length];

        back(nums);
        return result;
    }

    private void back(int[] nums) {
        if(curr.size() == nums.length) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(visited[i]) {
                continue;
            }

            curr.add(nums[i]);
            visited[i] = true;

            back(nums);

            curr.remove(curr.size() - 1);
            visited[i] = false;
        }
    }
}