class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int res=0;
        if(m%2!=0){
            for(int num:nums2){
                res^=num;
            }
        }

        int n=nums2.length;
        if(n%2!=0){
            for(int num:nums1){
                res^=num;
            }
        }
        return res;
    }
}