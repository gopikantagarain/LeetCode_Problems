class Solution {
    public int maxScore(String s) {
        int one=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') one++;
        }
        int zero=0;
        int maxScore=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0') zero++;
            else one--;
            maxScore=Math.max(maxScore,one+zero);
        }
        return maxScore;
    }
    
}