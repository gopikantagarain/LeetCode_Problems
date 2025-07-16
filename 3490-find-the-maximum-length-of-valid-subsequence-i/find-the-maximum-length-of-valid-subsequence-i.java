class Solution {
    public int maximumLength(int[] nums) {
        int countOdd=0;
        int countEven=0;
        for(int num:nums){
            if(num%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        int parity=nums[0]%2;
        int alternating=1;
        for(int i=1;i<nums.length;i++){
            int currParity=nums[i]%2;
            if(currParity != parity){
                alternating++;
                parity=currParity;
            }
        }
        int ans=Math.max(countOdd,countEven);
        return Math.max(ans,alternating);
    }
}