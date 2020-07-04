package integer;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		
		System.out.println(isPerfectSquare(1000000));
	}

	public static boolean isPerfectSquare(int num) {
		boolean perfectSquare=true;
		
		if(num==0 || num==1)return perfectSquare;
		
		
		double min = 0;
		double max = num;
		double middle = 0;
		
		while(min!=max) {
			middle = Math.floor((min+max)/2);

			System.out.println("min: "+min);

			System.out.println("middle: "+middle);
			System.out.println("max: "+max);
			double sqrt = middle*middle;
			if(sqrt==((double)num))return true;
			else if(sqrt>num) {
				if(max==middle)return false;
				
				max=middle;
			}else {
				if(min==middle)return false;
				
				min=middle;
			}
		}
		return false;
	}
}
