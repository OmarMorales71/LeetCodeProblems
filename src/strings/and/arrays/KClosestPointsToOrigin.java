package strings.and.arrays;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

	public static void main(String[] args) {
		KClosestPointsToOrigin obj = new KClosestPointsToOrigin();
		
		for(int[] a: obj.kClosest(new int[][] {{1,3},{-2,2}}, 1)) {
			System.out.println("["+a[0]+","+a[1]+"]");
		}

	}

	public int[][] kClosest(int[][] points, int K) {
		
		PriorityQueue<Point> pointsSorted = new PriorityQueue<Point>();
		
		for(int[] currentPoint:points) {
			Point p = new Point(currentPoint[0], currentPoint[1]);
			pointsSorted.add(p);
		}
		
		int[][] ans = new int[K][2];
		
		for(int[] res:ans) {
			Point p=pointsSorted.poll();
			res[0]=p.x;
			res[1]=p.y;
		}
		return ans;
	}
}

class Point implements Comparable<Point>{
	int x;
	int y;
	int distance;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		this.distance=(x*x)+(y*y);
	}

	@Override
	public int compareTo(Point o) {
		
		return this.distance-o.distance;
	}
	
}
