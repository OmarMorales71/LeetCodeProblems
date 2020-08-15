package dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome obj = new LongestPalindrome();

        System.out.println(obj.longestPalindrome("cccttt"));

    }

    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return 0;

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char w = s.charAt(i);

            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }
        int ans = 0;
        for (Integer n : map.values()) {

            ans += n;
            if (n % 2 != 0){
                ans--;
            }
        }

        return ans == s.length() ? ans : ans + 1;
    }
}
