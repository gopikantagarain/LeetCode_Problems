class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(end>=start){
            int middle=end-start/2;
            for(int i=0;i<=nums.length-1;i++){

                if (nums[middle]==target){
                    return middle;
                }
                else if (target>nums[middle]){
                    start=middle+1;

                    
                }
                else if (target<nums[middle]){
                    end=middle-1;
                }
            }
        }
        return start;

    }
}