package strings.and.arrays;

class StreamChecker {
    String dictionary;

    public StreamChecker(String[] words) {
        dictionary = "";

        for (String word : words) {
            dictionary += Character.toString(word.charAt(word.length() - 1));
        }

    }

    public boolean query(char letter) {
        if (dictionary.contains(Character.toString(letter)))
            return true;
        else
            return false;
    }
}
