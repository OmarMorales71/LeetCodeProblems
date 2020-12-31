package strings.and.arrays;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class IntegerToRoman {

    public static void main(String[] args) {
    IntegerToRoman obj = new IntegerToRoman();
        System.out.println(obj.intToRoman(4));
    }

    public String intToRoman(int num) {

        StringBuilder ans = new StringBuilder();
        final String[] ROMAN = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        final int[] INTEGER = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i=0; i<INTEGER.length;i++){
            while (num>=INTEGER[i]){
                num-=INTEGER[i];
                ans.append(ROMAN[i]);
            }
        }

        return String.valueOf(ans);
    }
}
