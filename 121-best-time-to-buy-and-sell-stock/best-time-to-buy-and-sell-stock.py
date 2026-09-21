class Solution:
    def maxProfit(self, prices: list[int]) -> int:

        max_profit = 0
        curr_profit = 0
        minbuy_price = prices[0]

        for price in prices:
            
            if(price < minbuy_price):
                minbuy_price = price
            else:
                curr_profit = price - minbuy_price
                max_profit = max(curr_profit,max_profit)
        
        return max_profit


        