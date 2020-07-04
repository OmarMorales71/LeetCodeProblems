package integer;

public class Power_of_Two {

	public static void main(String[] args) {
		Power_of_Two ocj = new Power_of_Two();
		
		System.out.println(ocj.isPowerOfTwo(1));

		System.out.println(ocj.isPowerOfTwo(2));

		System.out.println(ocj.isPowerOfTwo(3));

		System.out.println(ocj.isPowerOfTwo(16));

		System.out.println(ocj.isPowerOfTwo(218));

	}

	public boolean isPowerOfTwo(int n) {
		double ans = Math.log10(n)/Math.log10(2);
		if(ans%1==0) return true;
		else return false;
	}
}
