package strings.and.arrays;

public class MaximumSumCircularSubarray {

	public static void main(String[] args) {
		
		System.out.println(maxSubarraySumCircular(new int[] {-5,-2,5,6,-2,-7,0,2,8}));
	}

	public static int maxSubarraySumCircular(int[] A) {
				if(A.length==1)return A[0];
		//int limit=1;
		int max_current_1 = A[0],max_global_1=A[0], min_global=Math.min(A[1], A[1]+A[0]), ind_min=1;
		int min_current=Math.min(A[1], A[1]+A[0]);
		for(int i=1; i<A.length;i++) {
			max_current_1=Math.max(A[i], A[i]+max_current_1);
			if(i!=1)min_current = Math.min(A[i], A[i]+min_current);
			if(max_current_1>max_global_1)max_global_1=max_current_1;
			
			if(i!=0 || i!=A.length-1) {
				if(min_current<min_global) {
					min_global=min_current;
					ind_min=i;
				}
			}
			
			
		}
		
		int []circularArray = new int[A.length-1];
		int max_global_2=Integer.MIN_VALUE;
			
			System.arraycopy( A, ind_min+1, circularArray, 0, A.length-(ind_min+1) );
			System.arraycopy( A, 0, circularArray, A.length-(ind_min+1), ind_min );
			
			int max_current_2 = circularArray[0];
			max_global_2=circularArray[0];
			
			for(int i=1; i<circularArray.length;i++) {
				max_current_2=Math.max(circularArray[i], circularArray[i]+max_current_2);
				
				if(max_current_2>max_global_2)max_global_2=max_current_2;
				
				
				
			}
			
		
		
		return Math.max(max_global_1, max_global_2);
	}

}
