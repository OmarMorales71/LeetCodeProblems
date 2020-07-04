package dynamic_programming;

import java.util.HashMap;

public class ContiguousArray {

	public static void main(String[] args) {
		ContiguousArray obj = new ContiguousArray();
		
		System.out.println(obj.findMaxLength(new int [] {1,0,1,0,1,0}));
	}
	
	public int findMaxLength(int[] nums) {
        if(nums.length<2) return 0;
        
        HashMap<Integer, Integer> indexOfSum = new HashMap<Integer, Integer>();
        
        indexOfSum.put(0, -1);
        int maxLength = 0;
        int sum=0;
        
        for(int i = 0; i<nums.length;i++) {
        	if(nums[i]==0)sum +=-1;
        	else sum+=1;
        	
        	if(indexOfSum.containsKey(sum)) {
        		maxLength=Math.max(maxLength, i-(indexOfSum.get(sum)));
        	}else {
        		indexOfSum.put(sum, i);
        	}
        	
        }
		return maxLength;
    }

}
