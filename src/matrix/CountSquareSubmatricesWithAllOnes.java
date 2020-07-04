package matrix;

public class CountSquareSubmatricesWithAllOnes {

	public static void main(String[] args) {
		CountSquareSubmatricesWithAllOnes obj = new CountSquareSubmatricesWithAllOnes();
		
		System.out.println(obj.countSquares(new int [][] {{1,0,1},{1,1,0},{1,1,0}}));

	}

	public int countSquares(int[][] matrix) {
		int numSquares=0; 
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0; j<matrix[0].length;j++) {
				if(i==0 || j==0) {
					numSquares+=matrix[i][j];
				}else {
					if(matrix[i][j]!=0) {
						//if(matrix[i-1][j-1]!=0 && matrix[i-1][j]!=0 && matrix[i][j-1]!=0) {
							int newnum = Math.min(Math.min(matrix[i-1][j-1], matrix[i-1][j]), Math.min(matrix[i-1][j-1], matrix[i][j-1]));
							
							matrix[i][j]=newnum+1;
							numSquares+=matrix[i][j];
						//}else {
							
						//}
					}
				}
			}
		}
		return numSquares;
	}
}
