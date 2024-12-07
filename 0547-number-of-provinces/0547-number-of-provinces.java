class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean []visit=new boolean[isConnected.length];
        int ans=0;
        for(int i=0; i<isConnected.length; i++){
            if(!visit[i]){
                dfs(isConnected, visit, i);
                ans++;
            }
        }

        return ans;
    }

    public void dfs(int[][] isConnected, boolean []visit, int i){
        visit[i]=true;
        
        for(int j=0; j<isConnected.length; j++){
            if(isConnected[i][j]==1 && !visit[j]){
                dfs(isConnected, visit, j);
            }
        }
    }
}