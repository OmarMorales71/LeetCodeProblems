package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {

    }

    public List<List<Integer>> permute(Integer[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        int total = 1;
        for(int i = 1; i <= nums.length; i++){
            total *= i;
        }
        int x = 0;
        while(total!=0){
            List<Integer> per = Arrays.asList(nums);
            permutations.add(per);
            if(nums.length==1)
                break;

            if(x+1>=nums.length){
                x=0;
            }
            int temp = nums[x];
            nums[x] = nums[x+1];
            nums[x+1] = temp;
            x++;
            total--;

        }

        return permutations;
    }
}
