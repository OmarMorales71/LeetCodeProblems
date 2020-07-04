package contest_1;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {

	public static void main(String[] args) {
		Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length obj = new Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length();
		
		System.out.println(obj.maxVowels("aeiou", 2));

	}

	public int maxVowels(String s, int k) {
		String vowels = "aeiou";
		int max=0;
		int current = 0;
		for (int i = 0; i <k; i++) {
			if(vowels.contains(s.subSequence(i, i+1))) {
				current++;
				
			}
		}
		max=current;
		int j=k;
		for (int i = 0; j < s.length(); i++) {
			if(vowels.contains(s.subSequence(i, i+1))) {
				current--;
			}
			if(vowels.contains(s.subSequence(j, j+1))) {
				current++;
			}
			max= Math.max(max, current);
			if(max==k)return max;
			j++;
		}
		
		return max;
	}

}
