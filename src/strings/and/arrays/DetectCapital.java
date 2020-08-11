package strings.and.arrays;

public class DetectCapital {

    public static void main(String[] args) {

    }

    public boolean detectCapitalUse(String word) {
        if (word.length() == 1)
            return true;
        else {
            char firstLetter = word.charAt(0);
            if (firstLetter < 91) {
                String validating = word.substring(1);
                if (!validating.equals(validating.toLowerCase()) && !validating.equals(validating.toUpperCase())) {
                    return false;
                }
            } else {
                String validating = word.substring(1);
                if (!validating.equals(validating.toLowerCase())) {
                    return false;
                }
            }
        }
        return true;
    }
}
