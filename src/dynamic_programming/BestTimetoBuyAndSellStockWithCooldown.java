package dynamic_programming;

public class BestTimetoBuyAndSellStockWithCooldown {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        if(prices.length<2){
            return 0;
        }
        if(prices.length==2){
            if(prices[0]<prices[1]){
                return prices[1]-prices[0];
            }
            return 0;
        }

        int[][] dp = new int[2][prices.length];
        dp[0][0]=0;
        dp[1][0]=-prices[0];
        dp[0][1]=Math.max(dp[0][0], dp[1][0]+prices[1]);
        dp[1][1]= Math.max(dp[1][0], dp[0][0]- prices[1]);

        for(int i=2;i<prices.length;i++){
            dp[0][i]=Math.max(dp[0][i-1],dp[1][i-1]+ prices[i]);
            dp[1][i]=Math.max(dp[1][i-1],dp[0][i-2]-prices[i]);
        }
    return dp[0][dp[0].length-1];
    }
}
