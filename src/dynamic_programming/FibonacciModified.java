package dynamic_programming;

import java.util.Scanner;

public class FibonacciModified {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int numbers = in.nextInt();
        int lastNumber = in.nextInt();

        fibonacci_BottomUp(firstNumber, secondNumber, numbers, lastNumber);


    }


    private static void fibonacci_BottomUp(int firstNumber, int secondNumber, int numbers, int lastNumber) {
        int[] dp = new int[lastNumber + 2];

        dp[0] = firstNumber;
        dp[1] = secondNumber;

        for (int i = 0; i < lastNumber; i++) {
            if (i == 0 || i == 1) {
                System.out.println(dp[i]);
                break;
            }
            if (i == 2) {
                if (1 < numbers) {
                    dp[i] = dp[0] + dp[1];
                    System.out.println(dp[i]);
                } else {
                    dp[i] = (numbers == 1) ? dp[i - 1] : 0;
                    System.out.println(dp[i]);
                }
            } else if (i <= numbers) {

                dp[i] = dp[i - 1] * 2;
                System.out.println(dp[i]);
            } else {
                dp[i] = (dp[i - 1] * 2) - dp[(i - numbers) - 1];
                dp[i] = dp[i];
                System.out.println(dp[i]);
            }

        }
    }
}
