class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int pro=nums[0]*nums[1]*nums[n-1];
        int pro1=nums[n-1]*nums[n-2]*nums[n-3];
        int val=pro>pro1?pro:pro1;
        return val;
    }
}