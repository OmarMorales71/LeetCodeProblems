package strings.and.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Check_If_It_Is_A_Straight_Line {

	public static void main(String[] args) {
		int[][] coordinates = new int[3][2];

		coordinates[0][0] = 0;
		coordinates[0][1] = 1;

		coordinates[1][0] = 0;
		coordinates[1][1] = 2;

		coordinates[2][0] = 0;
		coordinates[2][1] = 3;

		coordinates[2][0] = 0;
		coordinates[2][1] = 4;

		System.out.println(checkStraightLine(coordinates));

	}

	public static boolean checkStraightLine(int[][] coordinates) {
		int difX = 0, difY = 0;

		if(coordinates.length==2)return true;
		
		float[] mb=null;
		boolean exception = false;
		int communX = 0;
		if ((coordinates[0][0] - coordinates[1][0]) == 0) {
			exception = true;
			communX = coordinates[0][0];
		} else {
			mb = getLine(coordinates[0], coordinates[1]);

		}


		for (int[] currentCoordinate : coordinates) {
			boolean yes = true;
			if (!exception) {
				yes = isInTheLine(currentCoordinate, mb[0], mb[1]);

			} else {
				yes = (currentCoordinate[0] == communX) ? true : false;
			}

			if (!yes) {
				return false;
			}
		}

		return true;
	}

	private static boolean isInTheLine(int[] currentCoordinate, float m, float b) {
		float res = (((float) currentCoordinate[0]) * m) + b;

		System.out.println(Math.round(res));
		return (Math.round(res) == currentCoordinate[1]) ? true : false;
	}

	private static float[] getLine(int[] is, int[] is2) {
		float[] ans = new float[2];
		float m = ((float) is2[1] - (float) is[1]) / ((float) is2[0] - (float) is[0]);
		ans[0] = m;
		float f = m * (float) is[0];
		float b = f - (float) is[1];
		ans[1] = -b;
		return ans;
	}
}
