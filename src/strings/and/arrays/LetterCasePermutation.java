package strings.and.arrays;

import java.util.LinkedList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {

    }

    public List<String> letterCasePermutation(String S) {
        List<String> answer = new LinkedList<>();
        permutations(S, answer, 0);
        return answer;
    }

    private void permutations(String s, List<String> answer, int index) {
        if(index>=s.length()){
            answer.add(s);
            return;
        }
        char l = s.charAt(index);
        if(l>='a' && l<='z'){
            permutations(s, answer, index+1);
            l-=32;
            String newS = s.substring(0,index)+l+s.substring(index+1);
            permutations(newS, answer, index+1);
        }else if(l>='A' && l<='Z'){
            permutations(s, answer, index+1);
            l+=32;
            String newS = s.substring(0,index)+l+s.substring(index+1);
            permutations(newS, answer, index+1);
        }else{
            permutations(s, answer, index+1);
        }
    }


}
