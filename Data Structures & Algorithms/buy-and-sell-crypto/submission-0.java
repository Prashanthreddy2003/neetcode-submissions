class Solution {
    public int maxProfit(int[] prices) {
        int low=prices[0];
        int profit=0;
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(low>prices[i]){
                low=prices[i];
            }
            else{
                profit=Math.max(prices[i]-low,profit);
                max=Math.max(max,profit);
            }
        }
        return max;
        
    }
}
