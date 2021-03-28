package strings.and.arrays;

public class PalindromicSubstrings {
    int count;

    public int countSubstrings(String s) {
        count = 0;
        substrings(new StringBuilder(s));
        return count;
    }

    private void substrings(StringBuilder s) {
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindromic(s.substring(i,j+1)))
                    count++;
            }
        }
    }

    public boolean isPalindromic(String s) {
        if(s.length()==0) return false;
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
