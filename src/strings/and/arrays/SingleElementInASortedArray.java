package strings.and.arrays;

public class SingleElementInASortedArray {

	public static void main(String[] args) {
	    

	}
	
	public int singleNonDuplicate(int[] nums) {
		int j = nums.length-1;
		
		if(nums[j]!=nums[j-1]) {
			return nums[j];
		}else if(nums[0]!=nums[1]) {
			return nums[0];
		}
		
		int lo = 0;
		
		int high = j;
		
		int middle = (lo+high)/2;
		
		while(lo<=high) {
			if(nums[middle]!=nums[middle-1] && nums[middle]!=nums[middle-1]) {
				return nums [middle];
			}else if(nums[middle]==nums[middle+1]){
				high=middle-1;
			}else if(nums[middle]==nums[middle-1]){
				lo=middle+1;
			}
		}
		return -1;
    }

}
