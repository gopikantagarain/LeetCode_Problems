class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea=0;
        int maxDiagonal=0;
        for(int i=0;i<dimensions.length;i++){
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            int diag=l*l + w*w;
            int area=l*w;
            if(diag>maxDiagonal){
                maxDiagonal=diag;
                maxArea=area;
            }
            else if(diag==maxDiagonal){
                maxArea=Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}