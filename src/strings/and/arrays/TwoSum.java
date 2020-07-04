package strings.and.arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

public int[] twoSum(int[] nums, int target) {
        
        int min = 0;
        int max = nums.length;
        int middle=(max+min)/2;
        
        int a[] = new int[2];
        while(max!=min) {
        	
        	if(nums[middle]==target) {
        		int [] re = {0,middle};
        		return re;
        	}
        
        }
        
        return null;
    }

}
