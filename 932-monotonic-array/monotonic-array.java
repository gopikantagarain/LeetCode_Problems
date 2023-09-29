class Solution {
    public boolean isMonotonic(int[] nums) {
        int m=0;
        int n=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                m+=1;
                break;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                n+=1;
                break;
            }
        }
        if(m==0 || n==0){
            return true;
        }
        else{
            return false;
        }
    }
}