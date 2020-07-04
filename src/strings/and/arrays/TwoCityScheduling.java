package strings.and.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {

	public static void main(String[] args) {

	}

	public int twoCitySchedCost(int[][] costs) {
		int sum = 0;
		int n = costs.length/2;
		Arrays.sort(costs, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return (o1[0]-o1[1])-((o2[0]-o2[1]));
			}
		});
		
		for(int i = 0 ; i<costs.length;i++) {
			if(i<n) {
				sum+=costs[i][0];
			}else {

				sum+=costs[i][1];
			}
		}

		return sum;
	}
}
