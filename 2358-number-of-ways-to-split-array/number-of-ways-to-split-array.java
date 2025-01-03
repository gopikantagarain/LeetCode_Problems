class Solution {
    public int waysToSplitArray(int[] nums) {
        long left=0;
        long right=0;
        for(int num:nums){
            right+=num;
        }
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];
            right-=nums[i];
            if(left>=right){
                ans++;
            }
        }
        return ans;
    }
}