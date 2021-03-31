package map;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.*;

public class RussianDollEnvelopes {

    public static void main(String[] args) {
        RussianDollEnvelopes obj = new RussianDollEnvelopes();
        System.out.println(obj.maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}}));
    }

    public int maxEnvelopes(int[][] envelopes) {
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                if (a1[0] == a2[0]) {
                    return a1[1] - a2[1];
                }
                return a1[0] - a2[0];
            }
        };
        TreeSet<int[]> set = new TreeSet<int[]>(comparator);

        for (int[] envelop : envelopes) {
            set.add(envelop);
        }
        int[][] list = new int[set.size()][2];
        int i = 0;
        for (int[] number : set) {
            list[i++] = number;
        }
        return lis(list);
    }

    public int lis(int[][] array) {
        int s[] = new int[array.length];
        int k = 0;
        int max = 1;
        for (int i = 0; i < array.length; i++) s[i] = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i][0]!=array[j][0] && array[i][1] > array[j][1]) {
                    k = s[j] + 1;
                    if (s[i] <= k) {
                        s[i] = k;
                        max=Math.max(max, s[i]);
                    }
                }
            }
        }

        return max;
    }
}
