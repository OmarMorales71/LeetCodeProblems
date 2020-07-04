package strings.and.arrays;

import java.util.Arrays;

public class IntervalListIntersections {

	public static void main(String[] args) {
		IntervalListIntersections obj = new IntervalListIntersections();

		System.out.println(obj.intervalIntersection(new int[][] { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } },
				new int[][] { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } }));

	}

	public int[][] intervalIntersection(int[][] A, int[][] B) {
		int[][] intersections = new int[1000][2];
		if(A.length==0 || B.length==0) {
			return new int[][] {};
		}
		int numIntersectios = 0;
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			for (; j < B.length; j++) {
				if (B[j][0] <= A[i][1] && B[j][1] >= A[i][0]) {
					intersections[numIntersectios][0] = Math.max(A[i][0], B[j][0]);

					intersections[numIntersectios][1] = Math.min(A[i][1], B[j][1]);

					numIntersectios++;

				}else {
					if(A[i][1]<B[j][0]) {
						if(j!=0)j--;
						break;
					}
				}
			}
			if(j==B.length)j--;
		}

		int[][] ans = Arrays.copyOfRange(intersections, 0, numIntersectios);

		return ans;
	}

}
