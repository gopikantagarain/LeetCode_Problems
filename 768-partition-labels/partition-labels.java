class Solution {
    public List<Integer> partitionLabels(String s) {

        int n = s.length();
        int end = 0;
        int [] lastIndex = new int [26];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++){
            lastIndex [s.charAt(i) - 'a'] = i;
        }
        int prev = 0;
        for (int j = 0; j < n; j++){
            end = Math.max(end, lastIndex[s.charAt(j) - 'a']);
            if (end == j) {
                ans.add(end + 1- prev);
                prev = j + 1;
                

            }
        }
        return ans;
        
        
    }
}