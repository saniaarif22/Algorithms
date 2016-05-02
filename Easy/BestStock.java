public class BestStock {
    public int maxProfit(int[] prices) 
    {
        if(prices.length<=1) return 0;
        int change[] = new int[prices.length]; //change in stock prices (don't even need a new array)
        int maxSoFar = 0, maxEndingHere = 0;
        for(int i = 1; i< prices.length ; i++)
        {
            change[i] = prices[i] - prices[i-1];
            maxEndingHere = Math.max(maxEndingHere+change[i], 0);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }
}