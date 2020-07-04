package graphs;

import java.util.*;

public class FindTheTownJudge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findJudge(int N, int[][] trust) {

		if(N==1 && trust.length==0) return 1;
		
		if(trust.length<N-1)return -1;
		
		ArrayList<Citizen> town = new ArrayList<Citizen>();
		for(int i=1; i<=N; i++) {
			town.add(new Citizen(i));
		}
		
		for(int[] edge: trust) {
			Citizen A = town.get(edge[0]-1);
			Citizen B = town.get(edge[1]-1);
			
			A.iTrustIn++;
			B.theyTrustInMe++;
		}
		
		Collections.sort(town);
		
		for(Citizen thisCitizen: town) {
			if(thisCitizen.iTrustIn==0) {
				if(thisCitizen.theyTrustInMe==N-1)return thisCitizen.name;
			}else {
				break;
			}
		}
		return -1;
	}

}

class Citizen implements Comparable<Citizen> {
	int iTrustIn;
	int theyTrustInMe;
	int name;

	public Citizen(int name) {
		this.name = name;
		iTrustIn = 0;
		theyTrustInMe = 0;
	}

	@Override
	public int compareTo(Citizen o) {
		// TODO Auto-generated method stub
		return this.iTrustIn-o.iTrustIn;
	}
}