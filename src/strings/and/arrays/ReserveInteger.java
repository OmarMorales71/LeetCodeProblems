package strings.and.arrays;

import java.util.Scanner;

public class ReserveInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println(reverse(2147483647));

	}

	 public static int reverse(int x) {
		    
	        String integerString = Integer.toString(x); //1
	        String reverseIntegerString ="";//1
	        
	        String sign=Character.toString(integerString.charAt(0)); //1
	        if(sign.equalsIgnoreCase("-")) {
	        	reverseIntegerString+=sign; //1
	        	integerString=integerString.substring(1); //1
	        }
	        	
	        
	        for(int i = integerString.length()-1; i>=0;i--) { //n
	        	String caracter = Character.toString(integerString.charAt(i));
	        	
	        	reverseIntegerString+=caracter;
	        }
	        int answer=0;
	        try {
	        answer = Integer.parseInt(reverseIntegerString);
	        }catch(Exception e) {
	        	return 0;
	        }
	        if(answer<((int)Math.pow(2, 31)-1) && answer>(-(int)Math.pow(2, 31))) {
	        	return answer;
	        }else {
		        return 0;

	        }
	        
	        
	 }
}
