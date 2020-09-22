package strings.and.arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        s=s.trim();
        int in = s.lastIndexOf(" ");
        return in!=-1?s.length()-in-1:s.length();
    }
}
