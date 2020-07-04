package strings.and.arrays;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		char[] msj = new char[] {'h','e','l','l','o','!'};
		obj.reverseString(msj);
		
		for(char letter: msj) {
			System.out.print(letter);
		}
	}

	public void reverseString(char[] s) {
		int l = 0, r = s.length - 1;
		
		while(l<r) {
			char aux = s[l];
			s[l]=s[r];
			s[r]=aux;
			l++;
			r--;
		}
	}

}
