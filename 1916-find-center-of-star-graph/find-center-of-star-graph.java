class Solution {
    public int findCenter(int[][] edges) {
        for(int i=1;i<edges.length;i++){
            for(int j=0;j<2;j++){
                if(edges[i][j]==edges[0][0] || edges[i][j]==edges[0][1]){
                    return edges[i][j];
                }
                
            }
        }
        return 0;
    }
}