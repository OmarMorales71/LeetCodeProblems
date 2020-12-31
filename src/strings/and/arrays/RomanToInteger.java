package strings.and.arrays;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger obj = new RomanToInteger();

        System.out.println(obj.romanToInt("IV"));
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<Character, Integer>();
        romanNumerals.put('I',1);
        romanNumerals.put('V',5);
        romanNumerals.put('X',10);
        romanNumerals.put('L',50);
        romanNumerals.put('C',100);
        romanNumerals.put('D',500);
        romanNumerals.put('M',1000);
        int ans = 0;

        int currentRomanValue=Integer.MAX_VALUE;
        for(int i = 0; i<s.length();i++){
            int n = romanNumerals.get(s.charAt(i));
            if(currentRomanValue<n){
                ans-=(currentRomanValue*2);
            }
            currentRomanValue=n;
            ans+=n;
        }
        return ans;
    }
}
