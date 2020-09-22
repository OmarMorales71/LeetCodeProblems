package integer;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static void main(String[] args) {
        SequentialDigits obj = new SequentialDigits();

        System.out.println(obj.sequentialDigits(1000,13000));
    }

    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        String stringLow = Integer.toString(low);
        int lengthLow = stringLow.length();
        String stringHigh = Integer.toString(high);
        int lengthHigh = stringHigh.length();
        int firstDigit = stringLow.charAt(0) - 48;

        for (int i = lengthLow; i <= lengthHigh; i++) {
            String sequentialNumber = "";

            if (firstDigit <= 10 - i) {
                for (int j = 1; j <= i; j++) {
                    sequentialNumber += firstDigit++;
                }
                if (Integer.parseInt(sequentialNumber) >= low && Integer.parseInt(sequentialNumber) <= high) {
                    ans.add(Integer.parseInt(sequentialNumber));
                }

                for (int k = firstDigit - i; k < 10 - i; k++) {
                    sequentialNumber=sequentialNumber.substring(1);
                    sequentialNumber += sequentialNumber.charAt(sequentialNumber.length() - 1) - 47;
                    if (Integer.parseInt(sequentialNumber) > high) {
                        return ans;
                    }
                    ans.add(Integer.parseInt(sequentialNumber));
                }
            }

            firstDigit = 1;

        }

        return ans;
    }
}
