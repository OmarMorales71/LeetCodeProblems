package dynamic_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LargestDivisibleSubset {
    public static void main(String[] args) {
        LargestDivisibleSubset obj = new LargestDivisibleSubset();
        for(int a:obj.largestDivisibleSubset(new int[]{546,669})){
            System.out.println(a);
        }
    }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums.length==0)return new ArrayList<>();
        if(nums.length==1) return (List<Integer>) Arrays.asList(nums[0]);
        Arrays.sort(nums);

        int[] dp = new int[nums.length];

        Arrays.fill(dp, 1);
        int max = 1;
        //LIS algorithm
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(max, dp[i]);
                }
            }
        }
        System.out.println(max);
        ArrayList<Integer> subSet = new ArrayList<>();
        int previous = -1;
        int i=nums.length-1;
        while (max>0) {
            if (dp[i] == max) {
                if (previous == -1) {
                    subSet.add(nums[i]);
                    previous = nums[i];
                    max--;
                } else {
                    if (previous % nums[i] == 0) {
                        subSet.add(nums[i]);
                        previous = nums[i];
                        max--;
                    }
                }
            }
            i--;
        }
        return subSet;
    }
}