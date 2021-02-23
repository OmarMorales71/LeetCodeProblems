package strings.and.arrays;

import java.util.ArrayList;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting {
    public static void main(String[] args) {
        String s = "foobarfoobar";
        List<String> dictionary = new ArrayList<>();
        dictionary.add("foo");
        dictionary.add("bar");

        System.out.println(findLongestWord(s, dictionary));
    }
    public static String findLongestWord(String s, List<String> d) {
        char[] s2 = s.toCharArray();
        String ans="";
        for(String w: d){
            boolean isValid=false;
            char[] word = w.toCharArray();
            int i=0;
            for(char c: s2){
                if(c==word[i]){
                    i++;
                    if(i>=word.length){
                        isValid=true;
                        break;
                    }
                }
            }
            if(isValid){
                if(ans.length()<word.length){
                    ans=String.valueOf(word);
                }else if(ans.length()==word.length){
                    if(ans.compareTo(String.valueOf(word))>0){
                        ans=String.valueOf(word);
                    }
                }
            }
        }
        return ans;
    }
}
