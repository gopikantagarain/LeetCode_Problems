class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0;
        int maxSum=0;
        int left=0;
        Set<Integer> set=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            set.add(nums[right]);
            sum+=nums[right];
            maxSum=Integer.max(sum,maxSum);

        }
        return maxSum;

    }
}
