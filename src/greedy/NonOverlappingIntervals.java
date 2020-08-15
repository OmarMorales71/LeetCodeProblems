package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        NonOverlappingIntervals obj = new NonOverlappingIntervals();

        System.out.println(obj.eraseOverlapIntervals(new int[][] {{1,5},{2,4}}));
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals==null || intervals.length<2)
            return 0;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o1[1]-o2[1];
            }
        });
        int overlappings=0;
        int i=0, j=1;
        while(j<intervals.length){
            if(intervals[i][1]<=intervals[j][0]){
                i=j;
                j++;
            }else{
                j++;
                overlappings++;
            }
        }
        return overlappings;
    }
}
