package single.array.part1;

class Day4_Stock_BuyandSell {
    // Function to calculate the maximum profit from stock prices
    public int maximumProfit(int prices[]) {
        int profit = 0;
        int buy = Integer.MAX_VALUE;

        for (int num : prices) {
            if (num > buy) {
                profit += (num - buy);
            }
            buy = num; 
        }
        return profit;
    }

    public static void main(String[] args) {
    	Day4_Stock_BuyandSell obj = new Day4_Stock_BuyandSell(); 
        int[] prices = {7,6,4,3,1}; 
        int maxProfit = obj.maximumProfit(prices); 
        System.out.println("Maximum Profit: " + maxProfit); 
    }
}
