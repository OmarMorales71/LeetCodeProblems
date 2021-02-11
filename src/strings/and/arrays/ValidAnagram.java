package strings.and.arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int [26];

        for(char c: s.toCharArray()){
            int index = c-97;
            alphabet[index]++;
        }

        for(char c: t.toCharArray()){
            int index = c-97;
            alphabet[index]--;
        }

        for(int i: alphabet){
            if(i!=0){
                return false;
            }
        }

        return true;
    }
}
