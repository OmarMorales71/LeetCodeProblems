package strings.and.arrays;

import java.util.Arrays;

public class Single_Number_II {

    public static void main(String[] args) {

    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i = 0; i<nums.length;i++){
            int previous=i-1, next=i+1;

            if(previous>=0 && next<nums.length) {
                if (nums[i] != nums[previous] && nums[i] != nums[next])
                    return nums[i];
            }else if (previous>=0){
                if (nums[i] != nums[previous])
                    return nums[i];
            }else if(next<nums.length) {
                if (nums[i] != nums[next])
                    return nums[i];
            }
        }
        return 1;
    }
}
