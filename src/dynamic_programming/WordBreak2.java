package dynamic_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordBreak2 {

    public static void main(String[] args) {

    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        return breaking(s, wordDict, new HashMap<String, List<String>>());
    }

    public List<String> breaking(String s, List<String> wordDict, HashMap<String, List<String>> dp) {
        if (dp.containsKey(s)) {
            return dp.get(s);
        }
        List<String> ans = new ArrayList<>();

        if (s.length() == 0) {
            ans.add("");
            return ans;
        }

        for (String word : wordDict) {

            if (s.startsWith(word)) {

                String sub = s.substring(word.length());
                List<String> subWords = breaking(sub, wordDict, dp);

                for (String su : subWords) {
                    ans.add((word + " " + su).trim());
                }

            }


        }
        dp.put(s, ans);
        return ans;
    }
}
