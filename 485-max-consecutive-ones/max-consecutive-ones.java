class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxi=0;
        //int n=nums.length;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==1){
                count++;
            }
            else
                count=0;
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
}