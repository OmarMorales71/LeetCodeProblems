package oralce;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int [n];
		for(int i = 0; i<A.length;i++) {
			A[i]=in.nextInt();
		}
		
		int max_current_1 = A[0],max_global_1=A[0];
		
		for(int i=1; i<A.length;i++) {
			max_current_1=Math.max(A[i], A[i]+max_current_1);
			if(max_current_1>max_global_1)max_global_1=max_current_1;			
			
		}
		System.out.println(max_global_1);
	}

}
