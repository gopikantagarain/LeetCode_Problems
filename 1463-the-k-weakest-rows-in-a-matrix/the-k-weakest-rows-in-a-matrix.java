class Solution {
public int[] kWeakestRows(int[][] mat, int k) {
    int t=0;
    int[] result = new int[k];
    boolean[] weak = new boolean[mat.length];
    for(int j=0; j<mat[0].length; j++){
        for(int i=0; i<mat.length; i++){
            if(!weak[i] && mat[i][j]==0){
                weak[i] = true;
                result[t++] = i;
                if(t>=k) return result;
            }
        }
    }
    for(int i=0; t<k; i++)
        if(!weak[i]) result[t++] = i;
    return result;
}
}