class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] res ={-1};
        for(int i = 0;i<=n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]==target-nums[i]){
                    res=new int[]{i,j};
                }
            }
        }
        return res;
    }
}