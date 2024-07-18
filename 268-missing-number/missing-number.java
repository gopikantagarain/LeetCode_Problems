// class Solution {
//     public int missingNumber(int[] nums) {
//         int result = nums.length;
//         for(int i=0;i<nums.length;i++) {
//             result += i - nums[i];
//         }
//         return result;
        
//     }
// }

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int arraySum = 0;
        for(int num: nums) {
            arraySum += num;
        }
        int sum = (n*(n+1))/2;
        return ans=(sum-arraySum);
    }
}
