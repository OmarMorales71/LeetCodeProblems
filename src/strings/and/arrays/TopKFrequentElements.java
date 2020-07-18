package strings.and.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {

    public static void main(String[] args) {
    TopKFrequentElements obj = new TopKFrequentElements();
        System.out.println(obj.topKFrequent(new int[]{1,2}, 2));
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<Integer,Integer>();
        List<List> bucket = new ArrayList<List>();
        for(int num:nums){
            if(frequency.containsKey(num)){
                frequency.put(num, frequency.get(num)+1);
            }else{
                frequency.put(num,1);
            }

            bucket.add(new ArrayList<Integer>());
        }

        for(int key: frequency.keySet()){
            int f = frequency.get(key);
            bucket.get(f-1).add(key);
        }

        int[] ans = new int[k];
        for(int i = bucket.size()-1; i>=0;i--){

            if(bucket.get(i).size()!=0){

                for(Object n: bucket.get(i)){
                    k--;
                    ans[k]= (int) n;
                }
                if (k==0) break;
            }
        }
        return ans;
    }

}
