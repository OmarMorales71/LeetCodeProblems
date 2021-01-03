package recursive;

public class BeautifulArrangement {

    public static void main(String[] args) {
        BeautifulArrangement obj = new BeautifulArrangement();

        System.out.println(obj.countArrangement(3));
    }

    int count = 0;

    public int countArrangement(int n) {
        int[] array = new int[n];

        for (int i = 1; i <= n; i++) {
            array[i - 1] = i;
        }

        permute(array, 0);


        return count;
    }

    private void permute(int[] array, int k) {
        if (k == array.length) {
            count++;
        }
        for (int i = k; i < array.length; i++) {
            swap(array, i, k);
            if (array[k] % (k + 1) == 0 || (k + 1) % array[k] == 0)
                permute(array, k + 1);
            swap(array, i, k);
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
