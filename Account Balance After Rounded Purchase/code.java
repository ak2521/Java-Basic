class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount==100)
        {
            return 0;
        }
        if(purchaseAmount%10==0)
        {
            return 100-purchaseAmount;
        }
        int round;
        round=(purchaseAmount/10)*10;
        if(purchaseAmount%10>=5)
        {
            round+=10;
        }
        return 100-round;
    }
}