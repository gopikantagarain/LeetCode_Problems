class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int CurrentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            CurrentSum = Math.max(nums[i],CurrentSum+nums[i]);
            maxSum= Math.max(maxSum,CurrentSum);
        }
        return maxSum;
        // int currSum=0;
        // int maxSum=0;
        // if(nums.length==1){
        //     maxSum=nums[0];
        //     return maxSum;
        // }
        // for(int i=0;i<nums.length;i++){
        //     currSum=currSum+nums[i];
        //     if(maxSum<currSum){
        //         maxSum=currSum;
        //     }
        //     if(currSum<0){
        //         currSum=0;
        //     }
        // }
        // return maxSum;
    }
}