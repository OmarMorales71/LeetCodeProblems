package strings.and.arrays;


import java.util.stream.IntStream;

public class CheckArrayFormationThroughConcatenation {
    public static void main(String[] args) {
        CheckArrayFormationThroughConcatenation obj = new CheckArrayFormationThroughConcatenation();

        System.out.println(obj.canFormArray(new int[]{49, 18, 16}, new int[][]{{16, 18, 49}}));
    }


    public boolean canFormArray(int[] arr, int[][] pieces) {
        boolean ans = true;

        for (int j = 0; j < pieces.length; j++) {

            int len = arr.length;
            int finalJ = j;
            int index = IntStream.range(0, len)
                    .filter(i -> pieces[finalJ][0] == arr[i])
                    .findFirst() // first occurrence
                    .orElse(-1);

            if (index == -1) {
                ans = false;
                break;
            }
            try {
                for (int k = index; k < index + pieces[j].length; k++) {
                    if (arr[k] != pieces[j][k - index]) {
                        ans = false;
                        break;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                ans = false;
            }

        }

        return ans;
    }
}
