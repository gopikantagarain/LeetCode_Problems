class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int prefixSum[]=new int[n];
        prefixSum[0]=isVowel(words[0]);
        for(int i=1;i<words.length;i++){
            prefixSum[i]=prefixSum[i-1]+isVowel(words[i]);
        }
        int m=queries.length;
        int ans[]=new int[m];
        for(int i=0;i<m;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int res=prefixSum[r];
            if(l != 0){
                res-=prefixSum[l-1];
            }
            ans[i]=res;
        }
        return ans;
    }
    public int isVowel(String word){
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);
        boolean isFirstVowel=(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u');
        boolean isLastVowel=(lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u');
        if(isFirstVowel && isLastVowel){
            return 1;
        }
        else
            return 0;
    }
}