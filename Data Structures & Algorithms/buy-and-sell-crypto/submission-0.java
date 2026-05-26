class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = prices[0];
        int len = prices.length;
        for(int i = 1; i < len; i++)
        {
            int sell = prices[i];
            if(sell > buy){
                max = Math.max(max, sell - buy);
            }
            else{
                buy = sell;
            }
        }
        return max;        
    }
}
