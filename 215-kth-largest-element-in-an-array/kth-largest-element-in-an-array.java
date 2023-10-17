class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        
        ans+=nums[nums.length-k];
        
        return ans;
    }
}