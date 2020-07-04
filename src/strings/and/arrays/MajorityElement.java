package strings.and.arrays;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		
		int[] nums = {3};
		System.out.println(majorityElement(nums));

	}

	public static int majorityElement(int[] nums) {
		
		Arrays.sort(nums);
		
		int i=0;
		for(int j=0; j<nums.length;j++) {
			if(nums[i]!=nums[j]) {
				int a = j-i;
				if((a*2)>(nums.length)) {
					
					return nums[i];
				}
				
				i=j;
			}
		}
		return nums[i];
	}

}
