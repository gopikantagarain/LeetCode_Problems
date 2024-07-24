class Solution {
    public int longestConsecutive(int[] nums) {
  
         int st = 0;
        int res = 0;
        Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 0) {
                res = Math.max(res,1);
                st++;
            }
            else if (nums[i] - nums[i - 1] != 1) {
                st = i;
            }else {
                res = Math.max(res, i - st+1);
            }
        }
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        return res;
        
    }
}