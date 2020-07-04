package strings.and.arrays;

public class SearchInsertPosition {

	public static void main(String[] args) {
		SearchInsertPosition obj = new SearchInsertPosition();
		System.out.println(obj.searchInsert(new int[] {5,6}, 7));

	}

	public int searchInsert(int[] nums, int target) {
		if(nums.length==0)return 0;
		
		int l = 0;
		int h = nums.length-1;
		
		while(l<h) {
			int mid = (l+h)/2;
			if(nums[mid]==target)
				return mid;
			else if(nums[mid]<target)
				l=mid+1;
			else if(nums[mid] >target)
				h=mid-1;
		}
		
		if(nums[l]<target)
			return l+1;
		else
			return l;
		
	}
}
