package strings.and.arrays;

import java.util.ArrayList;

public class InsertInterval {
    public static void main(String[] args) {
        InsertInterval obj = new InsertInterval();
        int[][] input = new int[][]{{1,2},{3,5},{8,10},{12,16}};
        obj.insert(input, new int[]{6,7});

    }

    public int[][] insert(int[][] intervals, int[] newInterval) {

        boolean searchingStart = true;
        int end = -1, start=-1;
        int[][] overlapping = new int[intervals.length][2];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] >= newInterval[0] && intervals[i][0] <= newInterval[1]) {
                if(end==-1){
                    start=i;
                }
                end++;
                overlapping[end] = intervals[i];
            }
        }
        int[][] ans=null;
        if(end==-1){
            ans = new int[intervals.length+1][2];
            int ansIndex=0;
            boolean foundIt=false;
            for(int i=0; i<intervals.length;i++){
                if(foundIt==false && newInterval[0]<intervals[i][0]){
                    ans[ansIndex]=newInterval;
                    ansIndex++;
                    foundIt=true;
                }
                ans[ansIndex]=intervals[i];
                ansIndex++;
            }

            if(foundIt==false){
                ans[ans.length-1]=newInterval;
            }

        }else{
            ans = new int[intervals.length-end][2];
            int ansIndex=0;
            newInterval[0]=Math.min(newInterval[0], overlapping[0][0]);
            newInterval[1]=Math.max(newInterval[1], overlapping[end][1]);

            for(int i=0; i<intervals.length;i++){
                if(start==i){
                    ans[ansIndex]=newInterval;
                    i=start+end;
                }else{
                    ans[ansIndex]=intervals[i];
                }
                ansIndex++;
            }
        }

        return ans;
    }
}
