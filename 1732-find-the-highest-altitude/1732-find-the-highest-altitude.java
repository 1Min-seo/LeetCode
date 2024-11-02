class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitudes=0;
        int highestAltitudes=currentAltitudes;

        for(int altitudeGain: gain){
            currentAltitudes+=altitudeGain;

            highestAltitudes=Math.max(currentAltitudes, highestAltitudes);
        }

        return highestAltitudes;
    }
}