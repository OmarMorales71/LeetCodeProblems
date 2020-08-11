package dynamic_programming;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
    LongestSubstringWithoutRepeatingCharacters obj = new LongestSubstringWithoutRepeatingCharacters();

        System.out.println(obj.lengthOfLongestSubstring("bbbbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String aux="";

        for(int i = 0; i<s.length();i++){
            String word = s.substring(i,i+1);
            if(aux.contains(word)){
                max=aux.length()>max?aux.length():max;
                aux=(aux.indexOf(word)+1)==aux.length()?"":aux.substring(aux.indexOf(word)+1);
            }
            aux+=word;
        }

        return aux.length()>max?aux.length():max;
    }
}
