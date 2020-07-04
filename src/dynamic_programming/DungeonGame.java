package dynamic_programming;

public class DungeonGame {
    public static void main(String[] args) {
        DungeonGame a = new DungeonGame();
        System.out.println(a.calculateMinimumHP(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}}));
    }

    public int calculateMinimumHP(int[][] dungeon) {
        if (dungeon == null) return 1;
        int[][] dp = new int[dungeon.length][dungeon[0].length];

        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if(i==dp.length-1 && j==dp[0].length-1)
                    dp[i][j] = (1 - dungeon[i][j]) < 1 ? 1 : 1 - dungeon[i][j];
                else {
                    int right = Integer.MAX_VALUE;
                    if (j != dp[0].length - 1)
                        right = dp[i][j + 1];
                    int down = Integer.MAX_VALUE;
                    if (i != dp.length - 1)
                        down = dp[i + 1][j];

                    int min = Math.min(right, down) - dungeon[i][j];

                    dp[i][j] = (min < 1) ? 1 : min;
                }
            }
        }
        return dp[0][0];
    }
}
