package greedy;

import java.util.Arrays;
import java.util.HashMap;

public class PrisonCellsAfterNDays {
    public static void main(String[] args) {
    PrisonCellsAfterNDays obj = new PrisonCellsAfterNDays();
        //System.out.println(0%4);
        //System.out.println(4%4);
    System.out.println(obj.prisonAfterNDays(new int[]{1,0,0,1,0,0,1,0},1_000_000_000));
    }

    public int[] prisonAfterNDays(int[] cells, int N) {
        HashMap<String, Integer> map = new HashMap<>();
        int[] newDay = new int[8];

        for(int i = 1; i<=N;i++){
            String s =Arrays.toString(cells);
            if (map.containsKey(s)){
                int range = (i-1)-map.get(s);
                int daysLeft = N-(i-1);
                int ans = (daysLeft%range);
                return prisonAfterNDays(cells, ans);
            }else{
                map.put(s,i-1);
                for(int j=1;j<7;j++){
                    newDay[j]=(cells[j-1]==cells[j+1])?1:0;
                }
                cells=newDay;
                newDay=new int[8];
            }

        }
        return cells;
    }

}
