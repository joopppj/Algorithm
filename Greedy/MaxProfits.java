public class MaxProfits {
    // given an array for which the ith element is the price of a given stock on day i. how to get max possible profit ? 
    // example: [1,2,1,2]  returns 2 
    public static int maxProfit(int[] prices) {
        int total=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])total+=(prices[i]-prices[i-1]);
        }
        return total;
    }
}
