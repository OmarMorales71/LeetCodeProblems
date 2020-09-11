package strings.and.arrays;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public static void main(String[] args) {

    }

    public List<Integer> partitionLabels(String S) {
        List<Integer> ans = new ArrayList<>();
        int[] last_index = new int[26];

        for(int i = 0; i< S.length();i++){
            last_index[S.charAt(i)-'a']=i;
        }

        int start=0, end=0;

        for(int i = 0; i< S.length();i++){
            end = Math.max(end, last_index[S.charAt(i)-'a']);

            if(end==i){
                ans.add((end-start)+1);
                start=end+1;
            }
        }
        return ans;
    }

}
