package dynamic_programming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence();
        System.out.println(obj.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }

    public int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];

        Arrays.fill(lis, 1);
        int max = 1;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[j]>nums[i]){
                    lis[j] = Math.max(lis[i]+1, lis[j]);
                    max = Math.max(max, lis[j]);
                }
            }
        }
        return max;
    }

}
