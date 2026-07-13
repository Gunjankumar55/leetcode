import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0 ; 
        int low = Integer.MAX_VALUE;
        int profit = 0 ;
        for(int i = 0 ; i < prices.length ; i++)
        {
            if(prices[i] < low){
                low = prices[i];
            }

         profit = prices[i] - low;
         if(profit >= max)
         {
            max = profit;
         }

        }
        return max;
    }
}