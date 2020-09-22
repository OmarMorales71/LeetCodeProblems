package integer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumIII {

    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(1, k, n, new LinkedList<Integer>(), ans);

        return ans;
    }

    private void combinations(int start, int k, int n, LinkedList<Integer> integers, List<List<Integer>> ans) {
        if(k<0 || n<0)
            return;

        if(k==0 && n==0){
            ans.add(new ArrayList<>(integers));
            return;
        }

        for(int i=start; i<10;i++){
            integers.add(i);
            combinations(i+1, k-1,n-i,integers,ans);
            integers.removeLast();
        }

    }
}
