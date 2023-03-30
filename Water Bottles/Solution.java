class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange)
        {
            int t=(numBottles/numExchange);
            sum=sum+t;
            numBottles=t+(numBottles%numExchange);
        }
        return sum;
    }
}
