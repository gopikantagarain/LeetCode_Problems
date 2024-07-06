class Solution {
    public int passThePillow(int n, int time) {
        int totalrounds=time/(n-1);
        boolean RevDir=(totalrounds%2 != 0);
        if(RevDir){
            return n-(time%(n-1));
        }
        else
            return time%(n-1)+1;
    }
}