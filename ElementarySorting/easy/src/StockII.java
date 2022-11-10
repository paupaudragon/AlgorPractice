package ElementarySorting.easy.src;

class StockII {
    public int maxProfit(int[] prices) {
        
        //this question is only asking to return the biggest profit not when to sell and buy. 
        //So any time there is buy low sell high happens, we need to add that difference in price to our return value.
        int profit = 0; 
        for(int i =1; i < prices.length; i++) {
            if(prices[i]>prices[i-1])
                profit += prices[i]-prices[i-1];
        }
        return profit;
    }
}