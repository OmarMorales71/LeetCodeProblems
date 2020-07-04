package dynamic_programming;

public class UniqueBinarySearchTree {
    public static void main(String[] args) {
        UniqueBinarySearchTree obj = new UniqueBinarySearchTree();
        System.out.println(obj.numTrees(6));
    }

    public int numTrees(int n) {
        if(n==0 || n==1)
            return 1;
        if (n == 2)
            return n;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            int ans = 0;
            for (int j = 0; j < i; j++) {
                int right = i - (j + 1);
                int left = j;
                ans += (dp[right] * dp[left]);

            }
            dp[i] = ans;
        }

        return dp[n];
    }

}
