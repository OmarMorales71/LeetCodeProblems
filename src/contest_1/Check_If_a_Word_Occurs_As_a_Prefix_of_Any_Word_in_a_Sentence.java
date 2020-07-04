package contest_1;

public class Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence {

	public static void main(String[] args) {
		Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence obj = new Check_If_a_Word_Occurs_As_a_Prefix_of_Any_Word_in_a_Sentence();
		
		System.out.println(obj.isPrefixOfWord("this problem is an easy problem", "proz"));

	}
	
	public int isPrefixOfWord(String sentence, String searchWord) {
    String[] sentenceArray = sentence.split(" "); 
    int answer = 1;
    for(String word:sentenceArray) {
    	if(word.startsWith(searchWord)) {
    		return answer;
    	}else {
    		answer++;
    	}
    }
    
    return -1;
    
    }

}
