package oralce;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] as1 = in.nextLine().split("");
		String[] as2 = in.nextLine().split("");
		String[] mergeString = in.nextLine().split("");

		if (as1.length + as2.length != mergeString.length) {
			System.out.println("INVALID MERGE");
			System.exit(0);
		}

		int[][] matrixSubsequence = new int[mergeString.length + 1][as1.length + 1];

		for (int i = 1; i <= mergeString.length; i++) {

			for (int j = 1; j <= as1.length; j++) {
				if (as1[j - 1].equalsIgnoreCase(mergeString[i - 1])) {

					matrixSubsequence[i][j] = matrixSubsequence[i - 1][j - 1] + 1;
				} else {

					matrixSubsequence[i][j] = Math.max(matrixSubsequence[i][j - 1], matrixSubsequence[i - 1][j]);
				}
			}

		}

		
		if (as1.length != matrixSubsequence[mergeString.length][as1.length]) {
			System.out.println("INVALID MERGE");
			System.exit(0);
		}

		matrixSubsequence = new int[mergeString.length + 1][as2.length + 1];

		for (int i = 1; i <= mergeString.length; i++) {

			for (int j = 1; j <= as2.length; j++) {
				if (as2[j - 1].equalsIgnoreCase(mergeString[i - 1])) {

					matrixSubsequence[i][j] = matrixSubsequence[i - 1][j - 1] + 1;
				} else {

					matrixSubsequence[i][j] = Math.max(matrixSubsequence[i][j - 1], matrixSubsequence[i - 1][j]);
				}
			}
		}
			if (as2.length != matrixSubsequence[mergeString.length][as2.length]) {
				System.out.println("INVALID MERGE");

			} else {
				System.out.println("VALID MERGE");
			}

		

	}
}
