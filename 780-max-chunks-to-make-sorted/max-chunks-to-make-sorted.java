class Solution {
    public int maxChunksToSorted(int[] arr) {
        int c=0;
        int maxV=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxV=Math.max(arr[i],maxV);
            if(maxV < i+1){
                c++;
            }
        }
        return c;
    }
}