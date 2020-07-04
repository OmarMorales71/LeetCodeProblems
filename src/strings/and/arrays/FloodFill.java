package strings.and.arrays;

import java.util.LinkedList;

public class FloodFill {

	public static void main(String[] args) {

	}

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int oldColor = image[sr][sc];
		int height = image.length;
		int width = image[0].length;

		int visited[][] = new int[height][width];

		LinkedList<int[]> pixels = new LinkedList<int[]>();
		int[] firstPixel = { sr, sc };
		pixels.add(firstPixel);

		while (!pixels.isEmpty()) {
			int[] currentPixel = pixels.poll();

			int x = currentPixel[0];
			int y = currentPixel[1];
			if (visited[x][y] == 0) {
				visited[x][y] = 1;
				image[x][y] = newColor;

				if (x + 1 < height) {
					if (image[x + 1][y] == oldColor) {
						int[] a = { x + 1, y };
						pixels.add(a);
					}

				}

				if (x - 1 >= 0) {
					if (image[x - 1][y] == oldColor) {
						int[] a = { x - 1, y };
						pixels.add(a);
					}
				}

				if (y + 1 < width) {
					if (image[x][y + 1] == oldColor) {
						int[] a = { x, y + 1 };
						pixels.add(a);
					}
				}

				if (y - 1 >= 0) {
					if (image[x][y - 1] == oldColor) {
						int[] a = { x, y - 1 };
						pixels.add(a);
					}
				}

			}
		}

		return image;
	}

}
