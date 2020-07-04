package dynamic_programming;

public class PerfectSquares {
    public static void main(String[] args) {
        PerfectSquares obj = new PerfectSquares();
        System.out.println(obj.numSquares(12));
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        return minSquares_BT(n);
    }

    private int minSquares(int[] dp, int n) {
        if (n == 0) return 0;
        int sqr = (int) Math.sqrt(n);
        if (dp[n] == 0) {
            int ans = Integer.MAX_VALUE;
            for (int i = 1; i <= sqr; i++) {
                ans = Math.min(ans, minSquares(dp, n - (i * i)));
            }
            dp[n] = ans + 1;
        }
        return dp[n];
    }

    private int minSquares_BT(int n){
        int sqr = (int) Math.sqrt(n);
        int[] dp = new int[n+1];

        for(int i = 1; i<=n;i++){
            int ans = Integer.MAX_VALUE;
            for(int j=1; j<=Math.sqrt(i);j++){
                ans = Math.min(ans, dp[i-(j*j)]);
            }
            dp[i]=ans+1;
        }

        return dp[n];
    }
}
