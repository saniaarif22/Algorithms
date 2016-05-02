public class BestStock {
    //Input: An array for which the ith element is the price of a given stock on day i.

    //You are permitted to complete at most one transaction, design an algorithm to find the maximum profit.
    //(i.e. buy one and sell one share of the stock)
    public int maxProfit(int[] prices) 
    {
        if(prices.length<=1) return 0; //Base case
        int change[] = new int[prices.length]; //to store change in stock prices (don't even need a new array)
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