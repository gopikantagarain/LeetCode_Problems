class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        int f= 0;
        for(int i=n-1;i>0;i--){
            if(nums[i] == nums[i-1]){
                f = f + 1;
            }
            else{
                count = count + 1;
            }
            if(count == 3){
                return nums[n-count-f]; 
            }
        }
        return nums[n-1];
    }
}