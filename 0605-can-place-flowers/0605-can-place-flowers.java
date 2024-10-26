class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt=n;
        
        for(int i=0; i<flowerbed.length; i++){
            if(cnt==0) return true;
            if(flowerbed[i]==0){
                boolean emptyLeftPlot= (i==0) || (flowerbed[i-1]==0);
                boolean emptyRightPlot= (i==flowerbed.length-1) || (flowerbed[i+1]==0);

                if(emptyLeftPlot && emptyRightPlot){
                flowerbed[i]=1;
                cnt--;
                }
            }
        } 
          return cnt==0;
    }
  
}