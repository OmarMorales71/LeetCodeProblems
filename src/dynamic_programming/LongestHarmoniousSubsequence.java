package dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int num: nums){
            frequency.put(num, frequency.getOrDefault(num,0)+1);
        }

        int max=0;

        for(int pivot: frequency.keySet()){
            int less = frequency.getOrDefault(pivot-1, 0);
            int more = frequency.getOrDefault(pivot+1, 0);
            int current = frequency.get(pivot);

            if(less!=0 || more!=0){
                less+=current;
                more+=current;

                max = Math.max(Math.max(less, more),max);
            }



        }
        return max;
    }
}
