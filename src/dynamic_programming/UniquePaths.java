package dynamic_programming;

public class UniquePaths {
    public static void main(String[] args) {
    UniquePaths obj = new UniquePaths();

        //System.out.println(obj.uniquePaths(7,3));

        double g = 3.0/2;
        System.out.println(g);
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return findPaths(dp,m-1,n-1);
    }

    private int findPaths(int[][] dp, int row, int col) {
        if(row==0 && col==0)
            return 1;

        if(row<0 || col<0)
            return 0;

        if(dp[row][col]==0){
            dp[row][col] = findPaths(dp,row-1,col) + findPaths(dp,row,col-1);
        }
        return dp[row][col];
    }
}
