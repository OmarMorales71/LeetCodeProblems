package dynamic_programming;

public class EditDistance {

	public static void main(String[] args) {
		EditDistance obj = new EditDistance();
		
		System.out.println(obj.minDistance("horse", "ros"));

	}

	public int minDistance(String word1, String word2) {
		String[] w1= word1.split("");
		String[] w2= word2.split("");
		
		int[][]minChange=new int[w1.length+1][w2.length+1];
		
		int i=1;
		boolean flag = true;
		while(flag) {
			if(i<=w1.length ||i<=w2.length) {
				if(i<=w1.length) {
					minChange[i][0]=i;
				}
				if(i<=w2.length) {

					minChange[0][i]=i;
				}
				i++;
			}else {
				flag = false;
			}
		}
		
		for(int m=1; m<=w1.length;m++) {
			for(int n=1; n<=w2.length;n++) {
				if(w1[m-1].equalsIgnoreCase(w2[n-1])) {
					minChange[m][n]=minChange[m-1][n-1];
				}else {
					minChange[m][n]=Math.min(Math.min(minChange[m-1][n-1], minChange[m][n-1]), Math.min(minChange[m-1][n-1], minChange[m-1][n]));
					minChange[m][n]++;
				}
			}
		}
		
		
		return minChange[w1.length][w2.length];
	}

}
