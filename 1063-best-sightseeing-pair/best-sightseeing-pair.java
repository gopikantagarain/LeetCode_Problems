class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int maxVal=0;
        int leftMax=values[0]+0;
        for(int j=1;j<values.length;j++){
            int temp=values[j]-j;
            maxVal=Math.max(maxVal,leftMax+temp);
            leftMax=Math.max(leftMax,values[j]+j);
        }
        
        return maxVal;
    }
}