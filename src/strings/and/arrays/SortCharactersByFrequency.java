package strings.and.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		SortCharactersByFrequency obj = new SortCharactersByFrequency();
		
		System.out.println(obj.frequencySort("Aabb"));
	}

	public String frequencySort(String s) {
		HashMap<String,String> frequencyMap= new HashMap<String, String>();
		
		String[] letters = s.split("");
		
		for(String letter: letters) {
			if(frequencyMap.containsKey(letter)) {
				String s1=frequencyMap.get(letter);
				s1+=letter;
				frequencyMap.put(letter, s1);
			}else {
				frequencyMap.put(letter, letter);
			}
		}
		List<String> lettersByFrequency = new ArrayList<>(frequencyMap.values());
		Collections.sort(lettersByFrequency, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.length()-o1.length();
			}
			
		});
		
		String ans ="";
		
		for(String word:lettersByFrequency) {
			ans+=word;
		}
		
		return ans;
	}

}
