class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt=n;
        for(int i=0; i<flowerbed.length; i++){
            if(cnt==0) return true;
            if(flowerbed[i]==0){
                boolean emptyLeftSpot= i==0 || flowerbed[i-1]==0;
                boolean emptyRightSpot= i==flowerbed.length-1 || flowerbed[i+1]==0;

                if(emptyLeftSpot && emptyRightSpot){
                    flowerbed[i]=1;
                    cnt--;
                }
            }
        }

        return cnt==0;
    }
}


