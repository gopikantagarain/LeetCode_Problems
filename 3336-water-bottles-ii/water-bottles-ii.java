class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans=numBottles;
        int EmptyBottles=numBottles;
        while(EmptyBottles >= numExchange){
            ans+=1;
            EmptyBottles-=numExchange;
            EmptyBottles++;
            numExchange++;

        }
        return ans;
    }
}