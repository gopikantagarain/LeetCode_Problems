class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unPlaced=0;
        boolean[] used=new boolean[baskets.length];
        for(int fruit:fruits){
            boolean isPlaced=false;
            for(int j=0;j<baskets.length;j++){
                if(fruit<=baskets[j] && !used[j]){
                    used[j]=true;
                    isPlaced=true;
                    break;
                }
            }
            if(!isPlaced){
                unPlaced+=1;
            }
        }
        return unPlaced;
    }
}