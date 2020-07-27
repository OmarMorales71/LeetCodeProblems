package strings.and.arrays;

public class Find_Minimum_in_Rotated_Sorted_Array_II {

    public static void main(String[] args) {
        Find_Minimum_in_Rotated_Sorted_Array_II obj = new Find_Minimum_in_Rotated_Sorted_Array_II();


        System.out.println(obj.findMin(new int[] {2,2,2,2,99}));
    }

    public int findMin(int[] nums) {
        int min = nums[0];

        for(int n: nums){
            if(n<min){
                min=n;
                return min;
            }

        }
        return min;
    }
}
