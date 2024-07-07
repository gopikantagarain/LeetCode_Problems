class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drank=numBottles;
        while(numBottles >= numExchange){
            int exchange=numBottles/numExchange;
            int empty=numBottles%numExchange;
            drank+=exchange;
            numBottles=exchange+empty;
        }
        return drank;
    }
}