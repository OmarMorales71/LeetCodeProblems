package strings.and.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        MajorityElementII obj = new MajorityElementII();
        System.out.println(obj.majorityElement(new int[]{3,2,3}));
    }

    public List<Integer> majorityElement(int[] nums) {
        double appear = nums.length / 3;

        Arrays.sort(nums);
        List<Integer> ans = new LinkedList<Integer>();
        int frequence = 0;
        int current = -404;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == current) {
                frequence++;
            } else {
                current=nums[i];
                if (frequence > appear) {
                    ans.add(nums[i - 1]);

                }
                frequence = 1;

            }
        }

        if (frequence > appear) {
            ans.add(nums[nums.length - 1]);
        }
        return ans;
    }
}
