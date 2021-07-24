package integer;

import java.util.Arrays;

public class ValidTriangleNumber {

    public static void main(String[] args) {
        ValidTriangleNumber obj = new ValidTriangleNumber();
        System.out.println(obj.triangleNumber(new int[]{4, 2, 3, 4}));
    }

    public int triangleNumber(int[] nums) {
        if(nums.length<3)
            return 0;

        Arrays.sort(nums);

        int a = 0;
        int c = 2;
        int b = c - 1;
        int count = 0;

        for(; c < nums.length;){


            if (nums[a]+nums[b] <= nums[c]){
                a++;
                if (a>=b){
                    a = 0;
                    c++;
                    b = c-1;
                }
                continue;
            }else{
                count += b - a;
                b--;
            }



        }
    return count;
    }
}
