package greedy;

import java.util.ArrayList;

public class PermutationSequence {

    public static void main (String[] args){
        PermutationSequence obj = new PermutationSequence();
        System.out.println(obj.getPermutation(1,1));
    }

    public String getPermutation(int n, int k) {
        ArrayList<Integer> ns = new ArrayList<Integer>();
        ArrayList<Integer> factorial = new ArrayList<Integer>();
        String ans = "";
        factorial.add(1);
        for(int i=1; i<=n;i++){
            ns.add(i);
            if(i!=1)
                factorial.add(factorial.get(i-2)*i);
        }

        for(int i=n-2; i>=0;i--){

            int num = (k-1)/factorial.get(i);
            ans+=Integer.toString(ns.remove(num));
            if(k>factorial.get(i))
                k=k-(factorial.get(i)*num); //k/(factorial de i * el index del numero que tomamos)

        }

        return ans+ns.remove(0);

    }
}
