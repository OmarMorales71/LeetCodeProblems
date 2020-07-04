package dynamic_programming;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robberHouse(dp, nums, 0);
    }

    private int robberHouse(int[] dp, int[] nums, int i) {
        if (i >= nums.length)
            return 0;

        if (dp[i] == -1) {
            int with = nums[i] + robberHouse(dp, nums, i + 2);

            int withOut = robberHouse(dp, nums, i + 1);

            dp[i] = Math.max(with, withOut);
        }
        return dp[i];
    }

}
