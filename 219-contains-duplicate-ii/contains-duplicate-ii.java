public class Solution {
public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	for(int i = 0; i <  nums.length; i++) {
		Integer lastexist = map.put(nums[i], i);
		if(lastexist != null && i - lastexist <= k) {
			return true;
		}
	}
	
	return false;
	}
}