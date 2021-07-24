package strings.and.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MaximumErasureValue {

    public static void main(String[] args) {
        MaximumErasureValue obj = new MaximumErasureValue();
        System.out.println(obj.maximumUniqueSubarray(new int[]{4, 2, 4, 5, 6}));
    }

    public int maximumUniqueSubarray(int[] nums) {
        int[] sum = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxScore = nums[0];
        int beg = -1;
        sum[0] = nums[0];
        map.put(nums[0], 0);

        for (int i = 1; i < nums.length; i++) {
            sum[i] = nums[i] + sum[i - 1];
            int duplicate = map.getOrDefault(nums[i], -2);
            if (duplicate >= beg) {
                beg=duplicate;
            }
            if(beg==-1){
                maxScore = Math.max(maxScore, sum[i]);
            }else{
                maxScore = Math.max(maxScore, sum[i] - sum[beg]);
            }
            map.put(nums[i], i);
        }

        return maxScore;
    }
}
