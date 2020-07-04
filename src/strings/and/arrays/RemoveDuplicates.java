package strings.and.arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(removeDuplicates(array));
		System.out.println();
		for(int nu: array) {
			System.out.print("["+nu+"]");
		}
		
	}
	
	public static int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
		int newLength=1;
		
		int max = nums[nums.length-1];
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]<nums[j]) {
					int aux=nums[i+1];
					nums[i+1]=nums[j];
					nums[j]=aux;
					newLength++;
					break;
				}
			}
			if(nums[i]==max)break;
		}
		return newLength;
    }

}
