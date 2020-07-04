package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class QueueReconstructionByHeight {

	public static void main(String[] args) {
		

	}
	
public int[][] reconstructQueue(int[][] people) {
        if(people.length<2)return people;
		Arrays.sort(people, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0]==o2[0]) {
					return o1[1]-o2[1];
				}
				return o1[0]-o2[0];
			}
			
		});
		
		int[][] ans = new int[people.length][people[0].length];
		for(int[] a:ans) {
			Arrays.fill(a, -1);
		}
		int count=0;
		
		for(int[] currentPerson: people) {
			count = currentPerson[1];
			for(int i=0; i<ans.length;i++) {
				if(ans[i][0]==-1 && ans[i][1]==-1) {
					if(count!=0) {
						count--;
					}else {
						ans[i]=currentPerson;
						break;
					}
				}else {
					if(ans[i][0]>=currentPerson[0]) {
						count--;
					}
				}
			}	
		}
		
		return ans;
    }
}
