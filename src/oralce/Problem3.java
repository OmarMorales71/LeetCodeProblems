package oralce;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		int n = in.nextInt();
		double distanceTotal=0;
		Point[] points = new Point[n];
		for(int i=0;i<n;i++) {
			double x=in.nextDouble();double y=in.nextDouble();
			points[i]=new Point(x,y);
		}
		
		for(int i=0;i<n-1;i++) {
			distanceTotal+=points[i].getDistanceTo(points[i+1]);
		}
		
		double halfDistance=distanceTotal/2;
		
		Point currentPoint=null;
		
		for(int i=0;i<n;i++) {
			if(halfDistance<points[i].distance) {
				currentPoint=points[i-1];
			}
		}
		
		if(halfDistance==currentPoint.distance) {
			System.out.println(currentPoint.x+" "+currentPoint.y);
			System.exit(0);
		}
	}

}

class Point{
	double x;
	double y;
	double distance=0;
	
	public Point(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public double getDistanceTo(Point p) {
		double res = Math.sqrt(Math.pow(p.x-this.x,2)+Math.pow(p.y-this.y,2));
		p.distance=res;
		return res;
	}
}
