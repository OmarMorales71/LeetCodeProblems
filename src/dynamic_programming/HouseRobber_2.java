package dynamic_programming;

public class HouseRobber_2 {

    public static void main(String[] args) {
    HouseRobber_2 obj = new HouseRobber_2();
        System.out.println(obj.rob(new int[]{2,7,9,3,1}));
    }

    public int rob(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        Integer[] dp=new Integer[nums.length];
        return robber(0, nums,dp);

    }

    private int robber(int i, int[] nums, Integer[] dp) {
        if(i>=nums.length)
            return 0;

        if(dp[i]==null){
            int takeThis = nums[i] + robber(i+2, nums, dp);
            int notTakeThis = robber(i+1,nums,dp);

            dp[i]=Math.max(takeThis, notTakeThis);
        }

        return dp[i];

    }
}
