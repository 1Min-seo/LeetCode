class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer>rad=new LinkedList<>();
        Queue<Integer>dir=new LinkedList<>();
        int senateLength=senate.length();

        for(int i=0; i<senate.length(); i++){
            if(senate.charAt(i)=='R'){
                rad.add(i);
            }else{
                dir.add(i);
            }
        }

        while(!rad.isEmpty() && !dir.isEmpty()){
            int rIndex=rad.poll();
            int dIndex=dir.poll();

            if(rIndex<dIndex){
                rad.add(senateLength+rIndex);
            }else{
                dir.add(senateLength+dIndex);
            }
        }

        return rad.isEmpty()?"Dire":"Radiant";
    }
}
