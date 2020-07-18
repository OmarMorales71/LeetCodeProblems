package strings.and.arrays;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        Subsets obj = new Subsets();

        obj.subsets(new int[]{1,2});
        System.out.println();

    }

    ArrayList<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        findSubsets(nums, new ArrayList<Integer>(), 0);
        return ans;
    }

    public void findSubsets(int[] nums, ArrayList<Integer> subset, int i) {
        if (nums.length <= i)
            ans.add(new ArrayList<Integer>(subset));
        else {
            findSubsets(nums, subset, i + 1);
            ArrayList<Integer> sub = new ArrayList<Integer>(subset);
            sub.add(nums[i]);
            findSubsets(nums, sub, i + 1);
        }
    }


}
