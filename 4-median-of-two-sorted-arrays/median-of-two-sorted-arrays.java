class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int j = 0;
        for(int i = 0; i < nums1.length; i ++){
            arr[j++] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i ++){
            arr[j++] = nums2[i];
        }
        Arrays.sort(arr);
        double median = 0.0;
        if(arr.length % 2 != 0){
            median = arr[arr.length / 2];
        }
        else{
            median = (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2.0;
        }
        return median;
    }
}