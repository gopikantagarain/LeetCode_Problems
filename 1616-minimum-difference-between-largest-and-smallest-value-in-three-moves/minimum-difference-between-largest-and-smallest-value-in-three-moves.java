class Solution {
    public int minDifference(int[] nums) {
        if(nums.length <=4){
            return 0;
        }
        int n=nums.length-1;
        Arrays.sort(nums);
        int result=Integer.MAX_VALUE;
        result=Math.min(result,nums[n-3]-nums[0]);
        result=Math.min(result,nums[n-2]-nums[1]);
        result=Math.min(result,nums[n-1]-nums[2]);
        result=Math.min(result,nums[n]-nums[3]);
        return result;
    }
}