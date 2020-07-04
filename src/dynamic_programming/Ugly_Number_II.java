package dynamic_programming;

import java.util.ArrayList;

public class Ugly_Number_II {
    public static void main(String[] args) {
        Ugly_Number_II obj = new Ugly_Number_II();
        System.out.println(obj.nthUglyNumber(11));
    }

    public int nthUglyNumber(int n) {
        if(n<=0) return 0;

        int two = 0;
        int three = 0;
        int five =0;
        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(1);
        while(n>1){
            n--;
            int numTwo=dp.get(two)*2;
            int numThree=dp.get(three)*3;
            int numFive=dp.get(five)*5;

            int min = Math.min(numTwo, Math.min(numThree, numFive));
            dp.add(min);

            if(numTwo==min)
                two++;
            if(numThree==min)
                three++;
            if(numFive==min)
                five++;
        }
        return dp.get(dp.size()-1);
    }
}
