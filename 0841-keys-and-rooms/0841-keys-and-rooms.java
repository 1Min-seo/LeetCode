class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visit[]=new boolean[rooms.size()];
        visit[0]=true;
        dfs(rooms, visit,0);

        return result(visit);
        
    }

    public void dfs(List<List<Integer>>rooms, boolean[] visit, int room){
        List<Integer> rm= rooms.get(room);
        for(int i=0; i<rm.size(); i++){
            int key=rm.get(i);

            if(visit[key]==false){
                visit[key]=true;
                dfs(rooms, visit, key);
            }
        }

    }

    public boolean result(boolean[] visit){
        for(boolean v:visit){
            if(v==false) return false;
        }
        return true;
    }
}